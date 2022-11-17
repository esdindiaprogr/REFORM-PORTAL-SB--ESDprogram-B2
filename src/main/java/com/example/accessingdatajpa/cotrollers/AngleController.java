package com.example.accessingdatajpa.cotrollers;

import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.accessingdatajpa.model.Angle;
import com.example.accessingdatajpa.service.AngleService;

 

//@CrossOrigin(origins = "*")
@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/api")
public class AngleController {
	
	private static final Logger log = LoggerFactory.getLogger(AngleController.class);

	@Autowired
	private AngleService service;

	/**
	 * Read single customer information
	 * 
	 * @return
	 * @throws Exception 
	 */
	//http://localhost:8080/api/getAngleById/{id} (interface for the rest api)
	
		
    @GetMapping("/getAngleById/{id}")
	public Optional<Angle> getAngleById(@PathVariable("id") Long id) throws Exception {
		return service.getAngleById(id);
	}

	/**
	 * Read operation
	 * 
	 * @return
	 */
	//
	
	@GetMapping("/allAngleRecord")
	public Iterable<Angle> getAllAngle() {
		return service.getAllAngle();
	}

	/**
	 * write operation insert create
	 * 
	 * @param customer
	 * @return
	 */
	@PostMapping("/addAngle")
	public @ResponseBody Angle addAngle(@RequestBody Angle angle) {
		return service.addAngle(angle);
		

	}

	/**
	 * to delete a single record
	 * 
	 * @param id
	 */

	@DeleteMapping("/deleteAngleById/{id}")
	public void deleteAngle(@PathVariable("id") Long id) {
		service.deleteAngleByid(id);

	}

	/**
	 * to udate the customer
	 * 
	 * @param newCustomer
	 * @param id
	 */

	@PutMapping("/updateAngle/{id}")
	public Angle updateAngle(@RequestBody Angle newAngle, @PathVariable("id") Long id) {
		log.info("Updating the customer record " + newAngle);
		try {
		return service.updateAngle(newAngle, id);
		
		 }catch (Exception ex) {
			log.error("new Angle not saved " + newAngle );
		}
        return null;
	}

}
