package com.example.accessingdatajpa.cotrollers;

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

import com.example.accessingdatajpa.model.Customer;
import com.example.accessingdatajpa.service.CustomerService;

 

@RestController
public class CustomerController {
	
	private static final Logger log = LoggerFactory.getLogger(CustomerController.class);

	@Autowired
	private CustomerService service;

	/**
	 * Read single customer information
	 * 
	 * @return
	 */
	@GetMapping("/getCustomerById/{id}")
	public Optional<Customer> getCustomerById(@PathVariable("id") Long id) {
		return service.getCustomerById(id);
	}

	/**
	 * Read operation
	 * 
	 * @return
	 */
	@GetMapping("/allrecord")
	public Iterable<Customer> getAllCustomer() {
		return service.getAllCustomer();
	}

	/**
	 * write operation insert create
	 * 
	 * @param customer
	 * @return
	 */
	@PostMapping("/addCustomer")
	public @ResponseBody String addCustomer(@RequestBody Customer customer) {
		service.addCustomer(customer);
		return " saved ";

	}

	/**
	 * to delete a single record
	 * 
	 * @param id
	 */

	@DeleteMapping("/deleteCustomerById/{id}")
	public void deleteCustomer(@PathVariable("id") Long id) {
		service.deleteCustomerByid(id);

	}

	/**
	 * to udate the customer
	 * 
	 * @param newCustomer
	 * @param id
	 */

	@PutMapping("/updateCustomer/{id}")
	public void updateCustomer(@RequestBody Customer newCustomer, @PathVariable("id") Long id) {
		log.info("Updating the customer record " + newCustomer);
		try {
		service.updateCustomer(newCustomer, id);
		
		 }catch (Exception ex) {
			log.error("new Cutomer not saved " + newCustomer );
		}
        
	}

}
