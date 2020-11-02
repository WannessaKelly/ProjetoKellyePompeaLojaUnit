package com.controller.PorjKellyLojaUnit;

import com.example.demoBD.ClienteRepositorio;
import com.example.demoBD.GetMapping;
import com.example.demoBD.PostMappingping;
import com.example.demoBD.RequestParam;
import com.example.demoBD.ResponseBody;
import com.example.demoBD.String;

public class ClienteController {
	
	 private ClienteRepositorio userRepository;
	  @PostMappingping(path="/add") // Map ONLY POST Requests
	  public @ResponseBody String addNewUser (@RequestParam String name
	      , @RequestParam String email) {
	    // @ResponseBody means the returned String is the response, not a view name
	    // @RequestParam means it is a parameter from the GET or POST request

	    User n = new User();
	    n.setName(nome);
	    n.setEmail(email);
	    userRepository.save(n);
	    return "Saved";
	  }

	  @GetMapping(path="/all")
	  public @ResponseBody Iterable<User> getAllUsers() {
	    // This returns a JSON or XML with the users
	    return userRepository.findAll();
	  }

}
