package com.negocio.ProjetoKellyLojaUnit;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.basica.ProjetoKellyLojaUnit.Fornecedor;
import com.repositorio.ProjetoKellyLojaunit.FornecedorRepositorio;

@Controller 
@RequestMapping(path="/ProjetoKellyLojaUnit") 

public class FornecedorController {
	
	private FornecedorRepositorio fornecedorRepository;
	  @PostMapping(path="/add") // Map ONLY POST Requests
	  public @ResponseBody String addNewUser (@RequestParam String nomeFornecedor
	      , @RequestParam String telefone, @RequestParam String cnpj, @RequestParam String email ) {
	    // @ResponseBody means the returned String is the response, not a view name
	    // @RequestParam means it is a parameter from the GET or POST request

	    Fornecedor f = new Fornecedor();
	    f.setNomeFornecedor(nomeFornecedor);
	    f.setTelefone(telefone);
	    f.setCnpj(cnpj);
	    
	   fornecedorRepository.save(f);
	    return "Saved";
	  }

	  @GetMapping(path="/all")
	  public @ResponseBody Iterable<Fornecedor> getAllUsers() {
	    // This returns a JSON or XML with the users
	    return fornecedorRepository.findAll();
	  }

	

}
