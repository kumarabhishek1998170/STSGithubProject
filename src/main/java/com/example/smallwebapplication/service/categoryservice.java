package com.example.smallwebapplication.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.smallwebapplication.dao.categoryrepo;
import com.example.smallwebapplication.entity.category;

@Service
public class categoryservice {
@Autowired
private categoryrepo cr;


public category createCategory(category c) {
	return cr.save(c);
}
public List<category> createCategories(List<category> c) {
	return cr.saveAll(c);
}
public category getcategorybyid(int id) {
	return cr.findById(id).orElse(null);
}
public List<category> getallcategories() {
	return cr.findAll();
}
public category updatecategory(category c) {
     Optional<category> oc=cr.findById(c.getId());
     category oldc=null;
     if(oc.isPresent()) {
    	  	oldc=oc.get();
    	  	oldc.setName(c.getName());
    	  	oldc.setDescription(c.getDescription());
    	  	cr.save(oldc);
     }else {
    	 return new category();
     }
     return oldc;

}
public String deletecategorybyid(int id) {
	cr.deleteById(id);
	return "Deleted successfully";
}





}
