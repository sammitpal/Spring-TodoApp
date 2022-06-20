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
@RequestMapping("/todo")
public class TodoController {
	
	@Autowired
	TodoRepository repository;
	
	@PostMapping("/create")
	public Todo create(@RequestBody Todo todo)
	{
		return repository.save(todo);
	}
	
	@GetMapping("/fetch")
	public Iterable<Todo> fetch() {
		return repository.findAll();
	}
}
