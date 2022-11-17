package com.example.accessingdatajpa.service;

import java.util.Optional;
import java.util.Random;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.accessingdatajpa.model.User;
import com.example.accessingdatajpa.repository.UserRepository;
import com.example.accessingdatajpa.util.RandomPassword;

@Service
public class UserService implements IUserService {
	
	private static final Logger log = LoggerFactory.getLogger(UserService.class);
	
	@Autowired
	private UserRepository repository;
	
	@Autowired
	private MailService mailService;
	
	@Autowired
	private RandomPassword randomPassword;

	
	public Optional<User> getUserById(Long id) throws Exception {
	
		return repository.findById(id);
	}

	
	public Iterable<User> getAllUser() {
		return repository.findAll();
	}

	
	public  User addUser( User user) {
		
		    //String hash = randomPassword.getRandomStringPassword();
		
		    String hash = randomPassword.apacheCommonRandomPassword();
		    
		    log.info(" Generated Hash value " + hash.toString());
		    
		    user.setPassword(hash); //hash value , id auto , email are providing 
		    user.setNewUser(true); //this true constant should be in seperate file 
		if (repository.save(user) !=null)
		{
			//mailService.sendEmail(user); //PERFORMANCE ISSUE  ... 
			//Thread create 
			//Create thread and send an email 
			//scheduer .. datbase expeore thoda are new user : mail send 
		}
		return user;

	}
	
	public  String deleteUserById(Long id) {
		 repository.deleteById(id);
		 return "deleted";
	}
	
	/**
	 * this method the update the user data 
	 */

	public  User updateUser(User newUser ,Long id) {
		
		  log.info("Updating the record for id "+ id + " newUser " + newUser.toString()) ;
		 
		  User user = repository.findById(id).get();
		  user.setEmail(newUser.getEmail());
		  user.setPassword(newUser.getPassword());
		  user.setNewUser(false); // update the newUser boolean field
		  
		 // angle.setAddress(newAngle.getAddress());
		 // angle.setFirstName(newAngle.getFirstName());
		 // angle.setLastName(newAngle.getLastName());
		  
		  repository.save(user);
		  
		  log.info("Customer Updated ") ;
		 return user;
	}

}
