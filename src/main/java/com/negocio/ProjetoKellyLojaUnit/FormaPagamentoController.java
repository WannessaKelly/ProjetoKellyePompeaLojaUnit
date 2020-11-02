package com.negocio.ProjetoKellyLojaUnit;

import org.apache.catalina.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.basica.ProjetoKellyLojaUnit.FormaPagamento;
import com.repositorio.ProjetoKellyLojaunit.FormaPagamentoRepositorio;

@Controller
@RequestMapping(path="/ProjetoKellyLojaUnit") 
public class FormaPagamentoController {

	private FormaPagamentoRepositorio formaPgtoRepository;
	  @PostMapping(path="/add") // Map ONLY POST Requests
	  public @ResponseBody String addNewUser (@RequestParam String formaPagamento, @RequestParam String descricao,
	       @RequestParam boolean ativo) {
	    // @ResponseBody means the returned String is the response, not a view name
	    // @RequestParam means it is a parameter from the GET or POST request

	    FormaPagamento f = new FormaPagamento();
	    f.setFormaPagamento(formaPagamento);
	    f.setDescricao(descricao);
	    f.setAtivo(ativo);
	    	  	    	    
	    formaPgtoRepository.save(f);
	    return "Saved";
	  }

	  @GetMapping(path="/all")
	  public @ResponseBody Iterable<FormaPagamento> getAllUsers() {
	    // This returns a JSON or XML with the users
	    return formaPgtoRepository.findAll();
	  }
}
