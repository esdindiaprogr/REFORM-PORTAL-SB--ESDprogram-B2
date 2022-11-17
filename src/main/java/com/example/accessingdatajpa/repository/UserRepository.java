package com.example.accessingdatajpa.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.accessingdatajpa.model.Angle;
import com.example.accessingdatajpa.model.Customer;
import com.example.accessingdatajpa.model.User;
import com.example.accessingdatajpa.model.Vendor;

public interface UserRepository extends CrudRepository<User, Long> {


	
    
   
}
