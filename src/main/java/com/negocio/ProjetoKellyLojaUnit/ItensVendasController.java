package com.negocio.ProjetoKellyLojaUnit;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.basica.ProjetoKellyLojaUnit.ItensVenda;
import com.repositorio.ProjetoKellyLojaunit.ItensVendasRepositorio;

@Controller 
@RequestMapping(path="/ProjetoKellyLojaUnit") 

public class ItensVendasController {

	private ItensVendasRepositorio itensVendaRepository;
	  @PostMapping(path="/add") // Map ONLY POST Requests
	  public @ResponseBody String addNewUser (@RequestParam Integer qtd
	      , @RequestParam double valorUnitario) {
	    // @ResponseBody means the returned String is the response, not a view name
	    // @RequestParam means it is a parameter from the GET or POST request

	    ItensVenda i = new ItensVenda();
	    i.setQtd(qtd);
	    i.setValorUnitario(valorUnitario);
	    	  	        
	    itensVendaRepository.save(i);
	    return "Saved";
	  }

	  @GetMapping(path="/all")
	  public @ResponseBody Iterable<ItensVenda> getAllUsers() {
	    // This returns a JSON or XML with the users
	    return itensVendaRepository.findAll();
	  }
}
