package com.test.test.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.test.model.Developer;
import com.test.test.repository.DeveloperRepositorty;

@Service
public class DeveloperService {
	
	@Autowired
	private DeveloperRepositorty repo;

	public List<Developer> getAll() {
		return repo.findAll(); 
	}
	
	public Optional<Developer> getById(int id) {
		return repo.findById(id);
	}
	
	public Developer addDeveloper(Developer devloper) {
		return repo.save(devloper);
	}
	
	public Developer updateDeveloper(Developer developer) {
		return repo.save(developer);
	}
	
	public void deleteDeveloper(int id) {
		repo.deleteById(id);
	}
}
