package com.example.accessingdatajpa.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.example.accessingdatajpa.model.Customer;
import com.example.accessingdatajpa.model.Vendor;

public interface VendorRepository extends CrudRepository<Vendor, Long> {


	Customer findById(long id);
    
   
}
