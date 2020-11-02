package com.negocio.ProjetoKellyLojaUnit;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.basica.ProjetoKellyLojaUnit.Vendas;
import com.repositorio.ProjetoKellyLojaunit.VendaRepositorio;

@Controller 
@RequestMapping(path="/ProjetoKellyLojaUnit") 

public class VendasController {
	
	private VendaRepositorio vendasRepository;
	  @PostMapping(path="/add") // Map ONLY POST Requests
	  public @ResponseBody String addNewUser (@RequestParam String dataHora
	      , @RequestParam double valorTotal) {
	    // @ResponseBody means the returned String is the response, not a view name
	    // @RequestParam means it is a parameter from the GET or POST request

	    Vendas v = new Vendas();
	    v.setDataHora(dataHora);
	    v.setValorTotal(valorTotal);
	    
	  	    	    
	    vendasRepository.save(v);
	    return "Saved";
	  }

	  @GetMapping(path="/all")
	  public @ResponseBody Iterable<Vendas> getAllUsers() {
	    // This returns a JSON or XML with the users
	    return vendasRepository.findAll();
	  }

}
