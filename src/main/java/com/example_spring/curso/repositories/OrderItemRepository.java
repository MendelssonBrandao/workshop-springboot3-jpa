package com.example_spring.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example_spring.curso.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
