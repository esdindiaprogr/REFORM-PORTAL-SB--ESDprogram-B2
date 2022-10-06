package com.rpsb.ESD.controller;


import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
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

import com.rpsb.ESD.model.Employee;
import com.rpsb.ESD.service.EmployeeService;

@RestController
@RequestMapping("/api/employees")
public class EmployeeControler {
	
	 private static final Logger log = LoggerFactory.getLogger(EmployeeControler.class);
@Autowired
	 private EmployeeService employeeService;

	public EmployeeControler(EmployeeService employeeService) {
		super();
		this.employeeService = employeeService;
	}
	 //build create employee REST API
	@PostMapping("/add")
	public ResponseEntity<Employee> saveEmployee(@RequestBody Employee employee){
		return new ResponseEntity<Employee>(employeeService.saveEmployee(employee),HttpStatus.CREATED);
  }
	
	
	//build get all employees REST API
	@GetMapping("/allemployee")
	public List<Employee> getAllEmployees(){
	return employeeService.getAllEmployees();
	}
	
	
	//build get employee by id REST API
	@GetMapping("/getemployee/{id}")
	public ResponseEntity<Employee> getEmployeeById(@PathVariable("id") long employeeId){
		return new ResponseEntity<Employee>(employeeService.getEmployeeById(employeeId),HttpStatus.OK);	
	}
	
	
	//build update employee Rest API
	@PutMapping("/updateemployee/{id}")
	public ResponseEntity<Employee> updateEmployee(@PathVariable("id") long id,@RequestBody Employee employee){
		log.info("Updating the employee record" + employee);
		try{
			employeeService.updateEmployee(employee,id);
		}
		
		catch(Exception ex){
		log.error("new employee not saved" + employee);
		}
		
		return new ResponseEntity<Employee>(employeeService.updateEmployee(employee, id), HttpStatus.OK);
		
	}
	
	
	//build delete employee REST API
	@DeleteMapping("/deleteemployeeById/{id}")
	public ResponseEntity<String> deleteEmployee(@PathVariable("id") long id){
		
	// delete employee from DB
		employeeService.deleteEmployee(id);
		
		return new ResponseEntity<String>("Employee deleted successfully",HttpStatus.OK);
	}
}	
	
	
	
	

