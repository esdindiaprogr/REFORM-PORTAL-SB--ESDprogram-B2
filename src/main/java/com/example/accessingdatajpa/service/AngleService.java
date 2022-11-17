package com.example.accessingdatajpa.service;

import java.util.Optional;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.example.accessingdatajpa.model.Angle;
import com.example.accessingdatajpa.model.Customer;
import com.example.accessingdatajpa.repository.AngleRepository;
import com.example.accessingdatajpa.repository.CustomerRepository;

@Service
public class AngleService implements IAngelService {
	
	private static final Logger log = LoggerFactory.getLogger(AngleService.class);
	
	@Autowired
	private AngleRepository repository;

	
	public Optional<Angle> getAngleById(Long id) throws Exception {
	
		return repository.findById(id);
	}

	
	public Iterable<Angle> getAllAngle() {
		return repository.findAll();
	}

	
	public  Angle addAngle( Angle angle) {
		return repository.save(angle);
		

	}
	
	public  String deleteAngleByid(Long id) {
		 repository.deleteById(id);
		 return "deleted";
	}
	

	public  Angle updateAngle(Angle newAngle ,Long id) {
		
		  log.info("Updating the record for id "+ id + " Customer " + newAngle.toString()) ;
		 
		  Angle angle = repository.findById(id).get();
		  
		 // angle.setAddress(newAngle.getAddress());
		 // angle.setFirstName(newAngle.getFirstName());
		 // angle.setLastName(newAngle.getLastName());
		  
		  repository.save(angle);
		  
		  log.info("Customer Updated ") ;
		 return angle;
	}
	
	
	
	
	
}
