package com.example_spring.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example_spring.curso.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
