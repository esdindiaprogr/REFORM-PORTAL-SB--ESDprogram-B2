package com.code.develop.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.code.develop.model.SignInData;

@RestController
@RequestMapping("/api")
public class LoginController {
	
	@PostMapping("/loginhelper/login")
	public ResponseEntity<String> AngelLogin(@RequestBody SignInData signIn) {
		//check that data first time login redirect to change passwrd page 
		return  new ResponseEntity<>("Login Successful",HttpStatus.OK);
	}
	

	
	@PostMapping("/loginhelper/changepassword")
	public  ResponseEntity<String> changeLoginPassword( @RequestBody SignInData signIn) {
		//stub  - > detail code .. srvice ->repo -> get the respult send the response 
		return  new ResponseEntity<>("Password Changed" ,HttpStatus.OK);
		//password : new password 
		
	}
	

}
