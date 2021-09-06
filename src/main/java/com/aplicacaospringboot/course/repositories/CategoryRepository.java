package com.aplicacaospringboot.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aplicacaospringboot.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

	
}
