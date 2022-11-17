package com.example.accessingdatajpa.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.example.accessingdatajpa.model.Angle;
import com.example.accessingdatajpa.model.Customer;
import com.example.accessingdatajpa.model.InterestArea;
import com.example.accessingdatajpa.repository.AngleRepository;
import com.example.accessingdatajpa.repository.CustomerRepository;
import com.example.accessingdatajpa.repository.InterestAreaRepository;

@Service
public class InterestAreaService {
	
	private static final Logger log = LoggerFactory.getLogger(InterestAreaService.class);
	
	@Autowired
	private InterestAreaRepository repository;

	
	public Optional<InterestArea> getInterestAreaById(Long id) {
	
		return repository.findById(id);
	}

	
	public List<InterestArea> getAllInterestArea() {
		
		Iterable<InterestArea> lstArea =	repository.findAll();
		
         List<InterestArea> lst = new ArrayList<InterestArea>();
		
		for(InterestArea obj : lstArea) {
			lst.add(obj);
		}
		return lst;   
	}

	
	public  InterestArea addInterestArea( InterestArea angle) {
		return repository.save(angle);
		

	}
	
	public  String deleteInterestAreaByid(Long id) {
		 repository.deleteById(id);
		 return "deleted";
	}
	

	public  InterestArea updateInterestArea(InterestArea newAngle ,Long id) {
		
		  log.info("Updating the record for id "+ id + " Customer " + newAngle.toString()) ;
		 
		  InterestArea angle = repository.findById(id).get();
		  
		 // angle.setAddress(newAngle.getAddress());
		 // angle.setFirstName(newAngle.getFirstName());
		 // angle.setLastName(newAngle.getLastName());
		  
		  log.info("Customer Updated ") ;
		 return  repository.save(angle);
		  
		  
		 
	}
	
	
	
	
	
}
