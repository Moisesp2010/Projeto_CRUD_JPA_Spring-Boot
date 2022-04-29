package com.spring.boot2.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.boot2.entities.User;
import com.spring.boot2.repositories.UserRepository;

import antlr.collections.List;

@RestController
@RequestMapping (value = "/users")
public class UserController {
	
	@Autowired
	private UserRepository repository;
	
	@GetMapping
	public List findAll() {
		List result = (List) repository.findAll();
		return result;
	}
	
	@GetMapping(value = "/{id}")
	public User findById(@PathVariable long id) {
		User result =  repository.findById(id).get();
		return result;
	}
	
	@PostMapping
	public User insert(@RequestBody User user) {
		User result =  repository.save(user);
		return result;
	}

}
