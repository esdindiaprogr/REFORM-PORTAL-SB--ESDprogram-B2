package com.example.accessingdatajpa.cotrollers;

import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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

import com.example.accessingdatajpa.model.SigninData;
import com.example.accessingdatajpa.model.SigninUser;
import com.example.accessingdatajpa.service.UserService;
import com.example.accessingdatajpa.model.User;

 

//@CrossOrigin(origins = "*")
@CrossOrigin(origins = "http://localhost:3000")// for react-fornt -end
@RestController
@RequestMapping("/api")
public class LoginController {
	
	private static final Logger log = LoggerFactory.getLogger(LoginController.class);

	@Autowired
	private UserService service;

	/**
	 * Read single customer information
	 * 
	 * @return
	 * @throws Exception 
	 */
	//http://localhost:8080/api/getAngleById/{id} (interface for the rest api)
	
    
	/**
	 * Read operation
	 * 
	 * @return
	 */
	//
	
	@GetMapping("/allUserRecord")
	public Iterable<User> getAllUsers() {
		return  service.getAllUser();  //service.getAllUsers();
	}

	/**
	 * write operation insert create
	 * 
	 * @param customer
	 * @return
	 */
	@PostMapping("/loginhelper/login")
	public  SigninUser loginhelper(@RequestBody SigninUser user) {
		return (user);
		

	}
	
		@PostMapping("/loginhelper/changepassword")
		public ResponseEntity <String> loginhelper(@RequestBody SigninData user) {
			return  new ResponseEntity<>("Password Changed" ,HttpStatus.OK);
		}

		

	/**
	 * to delete a single record
	 * 
	 * @param id
	 */

	@DeleteMapping("/deleteUserId/{id}")
	public void deleteUserById(@PathVariable("id") Long id) {
		service.deleteUserById(id);

	}
	

	/**
	 * to update the user
	 * 
	 * @param new User
	 * @param id
	 */

	@PutMapping("/updateUser/{id}")
	public User updateUser(@RequestBody User newUser, @PathVariable("id") Long id) {
		log.info("Updating the customer record " + newUser);
		try {
		return service.updateUser(newUser, id);
		
		 }catch (Exception ex) {
			log.error("new User not saved " + newUser );
		}
        return null;
	}

}



