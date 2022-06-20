package com.sammit.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {

	@Autowired
	UserRepository repo;
	
	@PostMapping("/create")
	public User create(@RequestBody User user) {
		return repo.save(user);
	}
	
	@GetMapping("/fetch/{id}")
	public User fetch(@PathVariable int id) {
		return repo.findById(id).orElse(new User());
	}
}
