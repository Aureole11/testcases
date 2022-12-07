package com.test.test.model;

import org.springframework.context.annotation.EnableAspectJAutoProxy;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table
public class Developer {

	@Id
	private int id;
	private String name;
	private String department;
	public Developer(int id, String name, String department) {
		super();
		this.id = id;
		this.name = name;
		this.department = department;
	}
	public Developer() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	@Override
	public String toString() {
		return "Developer [id=" + id + ", name=" + name + ", department=" + department + "]";
	}
	
	
}
