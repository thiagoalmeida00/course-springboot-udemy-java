package com.aplicacaospringboot.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aplicacaospringboot.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

	
}
