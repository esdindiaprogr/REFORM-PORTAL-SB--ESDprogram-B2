package com.example.accessingdatajpa.service;

import java.util.Optional;

import org.springframework.stereotype.Controller;

import com.example.accessingdatajpa.model.Angle;
import com.example.accessingdatajpa.model.User;

//API - application prog interface 
public interface IUserService {
	
	public Optional<User> getUserById(Long id) throws Exception;
	
	public Iterable<User> getAllUser() ;
	
	public  User addUser( User user) ;
	
	public  String deleteUserById(Long id) ;
	
	public  User updateUser(User newUser ,Long id);
	
}

