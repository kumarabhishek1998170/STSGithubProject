package com.example.smallwebapplication.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.smallwebapplication.dao.Employee;
import com.example.smallwebapplication.entity.asset;
import com.example.smallwebapplication.entity.employee;

@Service
public class employeeservice {
	
    @Autowired
	Employee ee;
    
    
//    employeeservice(){
//    	 employee emp1= new employee(1, "abhishek", "project Engineer", "DELL"); 
//    	    employee emp2= new employee(2, "abhi", "Engineer", "HP"); 
//    	    ee.save(emp1);
//    	    ee.save(emp2);
//    }
   
    
    public employee addEmployee(employee e) {
		// TODO Auto-generated method stub
	   ee.save(e);
		
		return  e;
	}

    
	
     

}
