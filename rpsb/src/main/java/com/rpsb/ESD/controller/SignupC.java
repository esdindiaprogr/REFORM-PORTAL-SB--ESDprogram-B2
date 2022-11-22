package com.rpsb.ESD.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.code.develop.model.SignupData;
import com.code.develop.service.signupService;

/*
 * 
 * @author Raman
 */

@CrossOrigin("*")
@RestController
@RequestMapping("/api")

public class SignupController {
	
	private static final Logger log =LoggerFactory.getLogger(SignupController.class);
	
	@Autowired
	private signupService service;
	
	@PostMapping("/signup")
	public  ResponseEntity<String> saveUserDetails(@ModelAttribute SignupData signUp) {
		log.info("Sign up req" + signUp.toString());
		boolean res1 = service.saveUser(signUp);
		//saving email and password in login table
		boolean res = service.saveEmailPassword(signUp);
		if (res == true && res1 == true)
			return  new ResponseEntity<>("Signup Successfull" ,HttpStatus.OK);
		else
			return  new ResponseEntity<>("Signup Not Successfull" ,HttpStatus.OK);
}
}
