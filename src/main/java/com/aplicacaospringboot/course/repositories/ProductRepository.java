package com.aplicacaospringboot.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aplicacaospringboot.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

	
}
