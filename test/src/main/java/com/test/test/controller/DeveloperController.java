package com.test.test.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.test.test.model.Developer;
import com.test.test.service.DeveloperService;

@RestController
public class DeveloperController {
	
	@Autowired
	private DeveloperService service;
	
	@GetMapping("/getAll")
	public List<Developer> getDeveloper(){
		return service.getAll();
	}
	
	@GetMapping("/get/{id}")
	public Optional<Developer> getById(@PathVariable int id) {
		return service.getById(id);
	}
	
	@PostMapping("/add")
	public Developer createDeveloper(@RequestBody Developer developer) {
		return service.addDeveloper(developer);
	}
	
	@PutMapping("/update")
	public Developer update(@RequestBody Developer developer) {
		return service.updateDeveloper(developer);
	}

	@DeleteMapping("/delete/{id}")
	public void delete(@PathVariable int id) {
		service.deleteDeveloper(id);
	}
}
