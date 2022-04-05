package com.example.smallwebapplication.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.smallwebapplication.entity.employee;

public interface Employee extends JpaRepository<employee, Integer> {
	

}
