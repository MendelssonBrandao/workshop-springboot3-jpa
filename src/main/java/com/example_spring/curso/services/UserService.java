package com.example_spring.curso.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example_spring.curso.entities.User;
import com.example_spring.curso.repositories.UserRepository;
import com.example_spring.curso.services.exceptions.ResourceNotFoundException;


@Service
public class UserService {

	@Autowired
	private UserRepository userRepository;
	
	public List<User> findAll() { 
		return userRepository.findAll();
	}
	
	public User findById(Long id) { 
		Optional<User> obj = userRepository.findById(id);
		return obj.orElseThrow( () -> new ResourceNotFoundException(id) );
	}
	
	public User insert(User obj) {
		return userRepository.save(obj) ; 
	}
	
	public void delete(Long id) {
		userRepository.deleteById(id);
	}
	
	public User update(Long id, User obj) {
		User user = userRepository.getReferenceById(id);
		updateData(user, obj);
		return userRepository.save(user);
	}

	private void updateData(User user, User obj) {
		user.setName(obj.getName());
		user.setEmail(obj.getEmail());
		user.setPhone(obj.getPhone());
	}
}
