package com.example_spring.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example_spring.curso.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
