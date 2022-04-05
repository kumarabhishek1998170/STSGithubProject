package com.example.smallwebapplication.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "EMPLOYEE")
public class employee {

@Id
@GeneratedValue
public int id;
public employee(int id, String name, String designation, String empassetname) {
	super();
	this.id = id;
	this.name = name;
	this.designation = designation;
	this.empassetname = empassetname;
}
public String name;
public String designation;
public String empassetname;

@Override
public String toString() {
	return "employee [id=" + id + ", name=" + name + ", designation=" + designation + ", empassetname=" + empassetname
			+ "]";
}



public String getEmpassetname() {
	return empassetname;
}
public void setEmpassetname(String empassetname) {
	this.empassetname = empassetname;
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
public String getDesignation() {
	return designation;
}
public void setDesignation(String designation) {
	this.designation = designation;
}



}
