package com.aplicacaospringboot.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aplicacaospringboot.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

	
}
