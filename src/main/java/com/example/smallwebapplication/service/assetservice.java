package com.example.smallwebapplication.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.smallwebapplication.dao.Asset;
import com.example.smallwebapplication.dao.Employee;
import com.example.smallwebapplication.dao.categoryrepo;
import com.example.smallwebapplication.entity.asset;
import com.example.smallwebapplication.entity.category;
import com.example.smallwebapplication.entity.employee;

@Service
public class assetservice {
	@Autowired
	private Asset ar;
	
	@Autowired
	private Employee e;
	
public asset addAsset(asset a) {
		return ar.save(a);
	}
	
	public List<asset> getallAssets() {
		return ar.findAll();
	}
 
	public String searchAssetbyname(String name) {
	      List<asset> li=ar.findAll();
	      asset aa=null;
	     for(asset a:li) {
	    	
	    	  if(a.getName().equals(name)) {
	    			
	    		  aa=a; 
	    		 
	    		  
	    	  break;
	    		 
	    	  }
	      }
	     String ans;
	     if(aa!=null) {
	    	 ans="Asset found";
	     }else {
	    	 ans="Asset not found";
	     }
		return ans;
	}
	
	public asset updateAsset(asset a) {
	     List<asset> li=ar.findAll();
	 
	    for(asset aa:li) {
	    	if(aa.getName().equals(a.getName())) {
	    		aa.setName(a.getName());
	    		aa.setPurchasedate(a.getPurchasedate());
	    		aa.setConditonnotes(a.getConditonnotes());
	    		aa.setAssignmentstatus(a.getAssignmentstatus());
	    		aa.setCategory(a.getCategory());
	    	}
	    }
	     return a;
	

}

	public String assignasset(String Assetname,int Empid) {
		String ans="";
	       employee ee=  e.getById(Empid);
	      ee.setEmpassetname(Assetname);
	      List<asset> aa=ar.findAll();
	      for(asset a:aa) {
	    	if(a.getName().equals(Assetname)) {
	    		a.setAssignmentstatus("Assigned");
	    		ar.save(a);
	    		break;
	    	}
	      }
	      
	    ans="Successfully assigned asset to an employee";
	    
		return ans;
	}
	
	
	
	
	public String recoverasset(int Empid) {
		String ans="";
		 employee ee=  e.getById(Empid);
		 String removedaseetname=ee.getEmpassetname();
	      ee.setEmpassetname("");
	      List<asset> aa=ar.findAll();
	      for(asset a:aa) {
	    	if(a.getName().equals(removedaseetname)) {
	    		a.setAssignmentstatus("Recovered");
	    		ar.save(a);
	    		break;
	    	}
	      }
	      
	    ans="Successfully Recovered asset from an employee";
	    
		return ans;
	}
	
	
	public String deleteasset(String assetname) {
		String ans="";
		
	      
	      List<asset> aa=ar.findAll();
	      for(asset a:aa) {
	    	if(a.getName().equals(assetname)) {
	    	  if(a.getAssignmentstatus().equals("Available")||
	    			  a.getAssignmentstatus().equals("Recovered")) {
	    		   ar.delete(a);
	    		   break;
	    		 
	    		  
	    	  }
	    	}
	      }
	      
	    ans="Successfully Deleted asset";
	    
		return ans;
	}
	
	
	
	
	
	
	
	
	
	
}
