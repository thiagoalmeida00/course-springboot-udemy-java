package com.aplicacaospringboot.course.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.aplicacaospringboot.course.entities.Product;
import com.aplicacaospringboot.course.services.ProductService;

// implementado por um controlador REST
// nome para o recurso (RequestMapping)

@RestController
@RequestMapping(value = "/products")
public class ProductResource {

	@Autowired
	private ProductService service;	
	
	//EndPoint para acessar usuário
	// retornar respostas de requisições web
	
	@GetMapping
	public ResponseEntity<List<Product>> findAll() {
		
		List<Product> list = service.findAll();
		
		// retornar resposta sucess Http
		return ResponseEntity.ok().body(list);
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<Product> findById(@PathVariable Long id) {
		Product obj = service.findById(id);
		return ResponseEntity.ok().body(obj);
	}

}
