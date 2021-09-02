package com.aplicacaospringboot.course.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.aplicacaospringboot.course.entities.User;
import com.aplicacaospringboot.course.services.UserService;

// implementado por um controlador REST
// nome para o recurso (RequestMapping)

@RestController
@RequestMapping(value = "/users")
public class UserResource {

	@Autowired
	private UserService service;	
	
	//EndPoint para acessar usuário
	// retornar respostas de requisições web
	
	@GetMapping
	public ResponseEntity<List<User>> findAll() {
		
		List<User> list = service.findAll();
		
		// retornar resposta sucess Http
		return ResponseEntity.ok().body(list);
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<User> findById(@PathVariable Long id) {
		User obj = service.findById(id);
		return ResponseEntity.ok().body(obj);
	}

}
