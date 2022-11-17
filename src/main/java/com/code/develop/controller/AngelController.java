package com.code.develop.controller;

import java.util.ArrayList;

import javax.websocket.server.PathParam;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.code.develop.model.AngelUser;

@RestController
@RequestMapping("/api")
public class AngelController {
	
	/**
	 * this will save email, password , default first_time_login : boolean (0,1)
	 * LoginUser
	 * @param user
	 * @return
	 */
	@PostMapping("/saveAngelUserLoginDetail")
	public  ResponseEntity<AngelUser> saveAngelUserLoginDetail(@RequestBody AngelUser angelUser) {
		 return new ResponseEntity<>(
		          new AngelUser(), 
		          HttpStatus.CREATED);// parallel to this you will send an email // 
	}
	
	@DeleteMapping("/deleteAngelUserById/{ahId}")
	public  Boolean deleteAngelUserById( @PathVariable ("ahId") Long ahId) {
		//stub code 
		return  true;
	}
	

	@PutMapping("/updateAngelUserById")
	public   ResponseEntity<AngelUser> updateAngelUserById( @RequestBody AngelUser angelUser) {
		//stub code 
		return new ResponseEntity<>(
		          new AngelUser(), 
		          HttpStatus.OK);
	}
	
	@GetMapping("/getAngelUserById/{ahId}")
	public  ResponseEntity<AngelUser> getAngelUserById( @PathVariable ("ahId") Long ahId) {
		//stub code 
		return new ResponseEntity<>(
		          new AngelUser(), 
		          HttpStatus.OK); // object having the provided id
	}
	
	@GetMapping("/getAllAngelUser")
	public  ResponseEntity <ArrayList<AngelUser>> getAllAngelUser() {
		//stub code 
		ArrayList<AngelUser> listAngel = new ArrayList<AngelUser>();
		return new ResponseEntity <>(listAngel,HttpStatus.OK );  // object having the provided id
	}
	
}
