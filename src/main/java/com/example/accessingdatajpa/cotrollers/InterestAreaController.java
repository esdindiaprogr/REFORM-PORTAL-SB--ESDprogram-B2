package com.example.accessingdatajpa.cotrollers;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.accessingdatajpa.model.InterestArea;
import com.example.accessingdatajpa.service.InterestAreaService;

 

@RestController
public class InterestAreaController {
	
	private static final Logger log = LoggerFactory.getLogger(InterestAreaController.class);

	@Autowired
	private InterestAreaService service;

	/**
	 * Read single customer information
	 * 
	 * @return
	 */
	@GetMapping("/getInterestAreaById/{id}")
	public Optional<InterestArea> getAngleById(@PathVariable("id") Long id) {
		return service.getInterestAreaById(id);
	}

	/**
	 * Read operation
	 * 
	 * @return
	 */
	@GetMapping("/allInterestAreaRecord")
	public List<InterestArea> getAllInterestArea() {
		return service.getAllInterestArea();
		
	}

	/**
	 * write operation insert create
	 * 
	 * @param customer
	 * @return
	 */
	@PostMapping("/addInterestArea")
	public @ResponseBody String addInterestArea(@RequestBody InterestArea angle) {
		service.addInterestArea(angle);
		return " saved ";

	}

	/**
	 * to delete a single record
	 * 
	 * @param id
	 */

	@DeleteMapping("/deleteInterestAreaById/{id}")
	public void deleteInterestArea(@PathVariable("id") Long id) {
		service.deleteInterestAreaByid(id);

	}

	/**
	 * to udate the customer
	 * 
	 * @param newCustomer
	 * @param id
	 */

	@PutMapping("/interestArea/{id}")
	public InterestArea updateInterestArea(@RequestBody InterestArea newAngle, @PathVariable("id") Long id) {
		log.info("Updating the InterestArea record " + newAngle);
		try {
		return service.updateInterestArea(newAngle, id);
		
		 }catch (Exception ex) {
			log.error("new Angle not saved " + newAngle );
		}
        return null;
	}

}
