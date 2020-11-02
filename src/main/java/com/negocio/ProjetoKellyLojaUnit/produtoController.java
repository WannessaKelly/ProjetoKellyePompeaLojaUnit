package com.negocio.ProjetoKellyLojaUnit;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.basica.ProjetoKellyLojaUnit.Produto;
import com.repositorio.ProjetoKellyLojaunit.ProdutoRepositorio;

@Controller // This means that this class is a Controller
@RequestMapping(path="/ProjetoKellyLojaUnit") // This means URL's start with /demo (after Application path)

public class produtoController {
	
	private ProdutoRepositorio produtoRepository;
	  @PostMapping(path="/add") // Map ONLY POST Requests
	  public @ResponseBody String addNewUser (@RequestParam String nomeProduto
	      , @RequestParam String descricao, @RequestParam double precoUnitario,
	      @RequestParam Integer unidade) {
	    // @ResponseBody means the returned String is the response, not a view name
	    // @RequestParam means it is a parameter from the GET or POST request

	    Produto p = new Produto();
	    p.setNomeProduto(nomeProduto);
	    p.setDescricao(descricao);
	    p.setPrecoUnitario(precoUnitario);
	    p.setUnidade(unidade);
	    	  	    	    
	    produtoRepository.save(p);
	    return "Saved";
	  }

	  @GetMapping(path="/all")
	  public @ResponseBody Iterable<Produto> getAllUsers() {
	    // This returns a JSON or XML with the users
	    return produtoRepository.findAll();
	  }

}
