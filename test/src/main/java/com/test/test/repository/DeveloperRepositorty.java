package com.test.test.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.test.test.model.Developer;

public interface DeveloperRepositorty extends JpaRepository<Developer, Integer>{

}
