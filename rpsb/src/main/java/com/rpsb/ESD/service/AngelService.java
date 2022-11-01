package com.rpsb.ESD.services;


import java.util.Optional;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.rpsb.ESD.model.AngelData;

import com.rpsb.ESD.AngelDataRepo;


@Service
public class AngelDataService {

	private static final Logger log = LoggerFactory.getLogger(AngelDataService.class);

	@Autowired
	private AngelDataRepository repository;


/**	public Optional<AngelData> getAngleById(Long id) {
		return repository.findById(id);
	}
	public Iterable<Angle> getAllAngle() {
		return repository.findAll();
	}
*/
	public  String addAngelData( AngelData angeldata) {
		repository.save(angeldata);
		return "Angel Data Save ";


	}


public com.rpsb.ESD.controllers.Optional<AngelData> getAngelDataById(Long id) {
	// TODO Auto-generated method stub
	return repository.getAngelDataByid();
}


/**	public  String deleteAngelDataByid(Long id) {
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
	*/





}
