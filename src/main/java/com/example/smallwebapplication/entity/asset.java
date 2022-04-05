package com.example.smallwebapplication.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
public class asset {
	@Id
	private String name;
	private String purchasedate;
	private String conditonnotes;
	private String category;
	private String assignmentstatus;

	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPurchasedate() {
		return purchasedate;
	}
	public void setPurchasedate(String purchasedate) {
		this.purchasedate = purchasedate;
	}
	public String getConditonnotes() {
		return conditonnotes;
	}
	public void setConditonnotes(String conditonnotes) {
		this.conditonnotes = conditonnotes;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getAssignmentstatus() {
		return assignmentstatus;
	}
	public void setAssignmentstatus(String assignmentstatus) {
		this.assignmentstatus = assignmentstatus;
	}
	
	@Override
	public String toString() {
		return "asset [name=" + name + ", purchasedate=" + purchasedate + ", conditonnotes=" + conditonnotes
				+ ", category=" + category + ", Assignmentstatus=" + assignmentstatus + "]";
	}

}
