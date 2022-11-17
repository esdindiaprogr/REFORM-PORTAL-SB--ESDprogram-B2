package com.example.accessingdatajpa.service;

import java.util.Optional;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.example.accessingdatajpa.model.Customer;
import com.example.accessingdatajpa.repository.CustomerRepository;

@Service
public class CustomerService {
	
	private static final Logger log = LoggerFactory.getLogger(CustomerService.class);
	
	@Autowired
	private CustomerRepository repository;

	
	public Optional<Customer> getCustomerById(Long id) {
	
		return repository.findById(id);
	}

	
	public Iterable<Customer> getAllCustomer() {
		return repository.findAll();
	}

	
	public  String addCustomer( Customer customer) {
		repository.save(customer);
		return " saved ";

	}
	
	public  String deleteCustomerByid(Long id) {
		 repository.deleteById(id);
		 return "deleted";
	}
	

	public  String updateCustomer(Customer newCustomer ,Long id) {
		
		  log.info("Updating the record for id "+ id + " Customer " + newCustomer.toString()) ;
		 
		  Customer customer = repository.findById(id).get();
		  
		  customer.setAddress(newCustomer.getAddress());
		  customer.setFirstName(newCustomer.getFirstName());
		  customer.setLastName(newCustomer.getLastName());
		  
		  repository.save(customer);
		  
		  log.info("Customer Updated ") ;
		 return "updated";
	}
	
	
	
	
	
}
