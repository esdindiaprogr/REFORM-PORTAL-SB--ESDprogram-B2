package com.rpsb.ESD.controller;
import java.util.List;
import java.util.Optional;

//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.rpsb.ESD.model.InterestArea;
import com.rpsb.ESD.service.InterestAreaService;

@RestController ("/interestArea")
public class InterestAreaController {
	
//private static final Logger log =LoggerFactory.getLogger(InterestAreaController.class);

@Autowired
private InterestAreaService<InterestArea> service;

/* 
 * 
 * Return single customer information
 * 
 * @return
 * */
@GetMapping("/getInterestAreaById/{id}")
public Optional<InterestArea>getAngleById(@PathVariable("id") Long id){
return service.getInterestAreaById(id);
}


@GetMapping("/allInterestAreaRecord")
public List<InterestArea> getAllInterestArea(){
return service.getAllInterestArea();
}

@PostMapping("/addInterestarea")
public @ResponseBody String addInterestArea(@RequestBody InterestArea angle){
service.addInterestArea(angle);
return"saved";

}


	@DeleteMapping("/deleteInterestAreaById/{id}")
public void deleteInterestArea(@PathVariable("id") Long id){
service.deleteInterestAreaByid(id);

}
	@PutMapping("/interestArea/{id}")
public InterestArea updateInterestArea(@RequestBody InterestArea newAngle,@PathVariable("id") Long id) {
//log.info("Updating the InterestArea record"+ newAngle);
//try{
//return service.updateInterestArea(newAngle,id);
//}catch(Exception ex){
//log.error("new Angle not saved"+ newAngle);
//}

   return null;
}
}

