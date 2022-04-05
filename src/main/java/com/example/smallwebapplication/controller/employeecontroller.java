package com.example.smallwebapplication.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.smallwebapplication.entity.asset;
import com.example.smallwebapplication.entity.employee;
import com.example.smallwebapplication.service.employeeservice;

@RestController
public class employeecontroller {
	@Autowired
	employeeservice es;
	
	@PostMapping("/addemployee")
	public employee addemployee(@RequestBody employee e) {
		
		return es.addEmployee(e);
	}
	
	


 
	

}
