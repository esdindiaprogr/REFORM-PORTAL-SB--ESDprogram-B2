package com.rpsb.ESD.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
//import com.rpsp.ESD.model.Employee;

import com.rpsb.ESD.model.InterestArea;
import com.rpsb.ESD.repository.InterestAreaRepository;

@Service
public class InterestAreaService<InterestArea> {
	
	 // private static final Logger log = LoggerFactory.getLogger(InterestAreaService.class);
	  
	  @Autowired
	  private InterestAreaRepository repository;
	  
	 
	  public List<InterestArea> getAllInterestAreadetail(){
		     Iterable<InterestArea> lstArea =    (Iterable<InterestArea>) repository.findAll();
		     List<InterestArea> lst = new ArrayList<InterestArea>();
		     for(InterestArea obj : lstArea) {
		    	 lst.add(obj);
		     }
		  return lst;
	  }
	  public String deleteInterestAreaByid(Long id) {
		  repository.deleteById(id);
		  return"deleted";
	  }
	  
	 // public InterestAreaRepository updateInterestArea(InterestArea newAngle , Long id) {
		 // log.info("Updating the record");
		//  InterestAreaRepository angle = (InterestAreaRepository) repository.findById(id).get();
		//  return repository.save(angle);
	 // }

	public Optional<com.rpsb.ESD.model.InterestArea> getInterestAreaById(Long id) {
		
		return repository.findById(id);
	}

	public void addInterestArea(com.rpsb.ESD.model.InterestArea angle) {
		// TODO Auto-generated method stub
		
	}
}
