package com.negocio.ProjetoKellyLojaUnit;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.basica.ProjetoKellyLojaUnit.Faq;
import com.repositorio.ProjetoKellyLojaunit.FaqRepositorio;

@Controller
@RequestMapping(path="/ProjetoKellyLojaUnit") 
public class FaqController {
	
	private FaqRepositorio faqRepository;
	  @PostMapping(path="/add") // Map ONLY POST Requests
	  public @ResponseBody String addNewUser (@RequestParam String dataHora
	      , @RequestParam String texto) {
	    // @ResponseBody means the returned String is the response, not a view name
	    // @RequestParam means it is a parameter from the GET or POST request

	    Faq f = new Faq();
	    f.setDataHora(dataHora);
	    f.setTexto(texto);
	    
	    faqRepository.save(f);
	    return "Saved";
	  }

	  @GetMapping(path="/all")
	  public @ResponseBody Iterable<Faq> getAllUsers() {
	    // This returns a JSON or XML with the users
	    return faqRepository.findAll();
	  }

}
