package com.example_spring.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example_spring.curso.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
