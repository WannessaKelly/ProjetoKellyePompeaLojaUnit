package com.negocio.ProjetoKellyLojaUnit;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.basica.ProjetoKellyLojaUnit.Cliente;
import com.repositorio.ProjetoKellyLojaunit.ClienteRepositorio;

@Controller 
@RequestMapping(path="/ProjetoKellyLojaUnit") 

public class ClienteController {
	
	private ClienteRepositorio clienteRepository;
	  @PostMapping(path="/add") // Map ONLY POST Requests
	  public @ResponseBody String addNewUser (@RequestParam String nome
	      , @RequestParam String email, @RequestParam String nomeSocial, @RequestParam String apelido,
	      @RequestParam String cpf, @RequestParam String fone,@RequestParam String sexo,
	      @RequestParam String dataNasc) {
	    // @ResponseBody means the returned String is the response, not a view name
	    // @RequestParam means it is a parameter from the GET or POST request

	    Cliente c = new Cliente();
	    c.setNome(nome);
	    c.setEmail(email);
	    c.setNomeSocial(nomeSocial);
	    c.setApelido(apelido);
	    c.setSexo(sexo);
	    c.setDataNasc(dataNasc);
	    c.setFone(fone);
	    c.setCpf(cpf);
	  	    	    
	    clienteRepository.save(c);
	    return "Saved";
	  }

	  @GetMapping(path="/all")
	  public @ResponseBody Iterable<Cliente> getAllUsers() {
	    // This returns a JSON or XML with the users
	    return clienteRepository.findAll();
	  }

}
