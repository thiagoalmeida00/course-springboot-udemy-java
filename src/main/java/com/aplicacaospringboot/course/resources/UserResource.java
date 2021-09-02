package com.aplicacaospringboot.course.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.aplicacaospringboot.course.entities.User;

// implementado por um controlador REST
// nome para o recurso (RequestMapping)

@RestController
@RequestMapping(value = "/users")
public class UserResource {

	//EndPoint para acessar usuário
	// retornar respostas de requisições web
	
	@GetMapping
	public ResponseEntity<User> findAll() {
		
		User user = new User(1L, "Maria", "maria@gmail.com", "99999999", "12345");
		
		// retornar resposta sucess Http
		return ResponseEntity.ok().body(user);
	}

}
