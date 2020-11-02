package com.negocio.ProjetoKellyLojaUnit;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.basica.ProjetoKellyLojaUnit.Marca;
import com.repositorio.ProjetoKellyLojaunit.MarcaRepositorio;

@Controller 
@RequestMapping(path="/ProjetoKellyLojaUnit") 
public class MarcaController {
	
	private MarcaRepositorio marcaRepository;
	  @PostMapping(path="/add") // Map ONLY POST Requests
	  public @ResponseBody String addNewUser (@RequestParam String nomeFabricante
	      , @RequestParam String descricao) {
	    // @ResponseBody means the returned String is the response, not a view name
	    // @RequestParam means it is a parameter from the GET or POST request

	    Marca m = new Marca();
	    m.setNomeFabricante(nomeFabricante);
	    m.setDescricao(descricao);
	    
	    marcaRepository.save(m);
	    return "Saved";
	  }

	  @GetMapping(path="/all")
	  public @ResponseBody Iterable<Marca> getAllUsers() {
	    // This returns a JSON or XML with the users
	    return marcaRepository.findAll();
	  }

	

}
