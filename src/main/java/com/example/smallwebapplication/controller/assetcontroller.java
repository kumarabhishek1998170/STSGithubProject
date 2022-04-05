package com.example.smallwebapplication.controller;

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

import com.example.smallwebapplication.dao.categoryrepo;
import com.example.smallwebapplication.entity.asset;
import com.example.smallwebapplication.entity.category;
import com.example.smallwebapplication.entity.employee;
import com.example.smallwebapplication.service.assetservice;
import com.example.smallwebapplication.service.categoryservice;

@RestController
public class assetcontroller {

	@Autowired
	assetservice as;
	@PostMapping("/addasset")
	public asset addasset(@RequestBody asset a) {
		
		return as.addAsset(a);
	}
	 @GetMapping("/getallAsset")
	 public List<asset> getallAsset() {
		 return as.getallAssets();
	 }
	 
	 @GetMapping("/getassetbyName/{name}")
	 public String searchassetbyname(@PathVariable String name) {
		 
		 return as.searchAssetbyname(name.toString());
	 }
	 

 @PutMapping("/updateasset")
 public asset updateasset(@RequestBody asset a ) {
	 return as.updateAsset(a);
 }
 
 @PostMapping("/assignasset/{Assetname}/{Empid}")
 public String assignAsset(@PathVariable String Assetname,
		 @PathVariable int Empid ) {
	 
	String ans= as.assignasset(Assetname.toString(),Empid);
	 
	 return ans;
			 
			 
			 
 }
 
 
 @PostMapping("/assignasset/{Empid}")
 public String recoverAsset(@PathVariable int Empid ) {
	 
	String ans= as.recoverasset(Empid);
	 
	 return ans;
			}
 
 
 @PostMapping("/deleteasset/{Assetname}")
 public String deleteAsset(@PathVariable String Assetname) {
	 
	String ans= as.deleteasset(Assetname);
	 
	 return ans;
			}
 
 

 
 
 



	
}
