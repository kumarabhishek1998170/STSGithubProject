package com.example.smallwebapplication.controller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.example.smallwebapplication.entity.category;
import com.example.smallwebapplication.service.categoryservice;

@RestController
public class categorycontroller {
	@Autowired
	categoryservice cs;
	@PostMapping("/addcategory")
	public category addcategory(@RequestBody category c) {
		
		return cs.createCategory(c);
	}
	@PostMapping("/addcategories")
 public List<category> addallcategory(@RequestBody List<category> c){
	 return cs.createCategories(c);
 }
 @GetMapping("/getcategory/{id}")
 public category getcaregorybyid(@PathVariable int id) {
	 return cs.getcategorybyid(id);
 }
 
 @GetMapping("/getAllcategories")
 public List<category> getallcaregory() {
	 return cs.getallcategories();
 }
 @PutMapping("/updatecategory")
 public category updatecategory(@RequestBody category c ) {
	 return cs.updatecategory(c);
 }
 
 
 @DeleteMapping("/deletemapping")
 public String deletecategory(@PathVariable int id) {
	 cs.deletecategorybyid(id);
	 return "Deleted";
 }
 
 
 
 
 
 
 
 
 

}
