package com.example.accessingdatajpa.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Vendor {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	Long id;
	
	
	String vendorName; 
	String vendorAdd;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getVendorName() {
		return vendorName;
	}
	public void setVendorName(String vendorName) {
		this.vendorName = vendorName;
	}
	public String getVendorAdd() {
		return vendorAdd;
	}
	public void setVendorAdd(String vendorAdd) {
		this.vendorAdd = vendorAdd;
	}
	

}
