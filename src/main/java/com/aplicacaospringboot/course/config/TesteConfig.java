package com.aplicacaospringboot.course.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.aplicacaospringboot.course.entities.User;
import com.aplicacaospringboot.course.repositories.UserRepository;

@Configuration
@Profile("test")
public class TesteConfig implements CommandLineRunner {

	// mecanismo de injeção de dependência automático
	// associar uma instância do UserRepository no TestConfig

	@Autowired
	private UserRepository userRepository;

	// executar quando a aplicação for iniciada
	@Override
	public void run(String... args) throws Exception {

		User u1 = new User(null, "Maria Brown", "maria@gmail.com", "988888888", "123456");
		User u2 = new User(null, "Alex Green", "alex@gmail.com", "977777777", "123456");

		// salva uma lista de objetos (criada no parâmetro)
		userRepository.saveAll(Arrays.asList(u1,u2));
		
	}

}
