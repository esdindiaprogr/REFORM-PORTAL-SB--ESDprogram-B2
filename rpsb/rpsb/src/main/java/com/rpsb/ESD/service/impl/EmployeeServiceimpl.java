package com.rpsb.ESD.service.impl;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import com.rpsb.ESD.exception.ResourceNotFoundException;
import com.rpsb.ESD.model.Employee;
import com.rpsb.ESD.repository.EmployeeRepository;
import com.rpsb.ESD.service.EmployeeService;


@Service
public class EmployeeServiceimpl implements EmployeeService {
	
	private static final Logger Log = LoggerFactory.getLogger(EmployeeServiceimpl.class); 
	
	private EmployeeRepository employeeRepository;
	
 
	public EmployeeServiceimpl(EmployeeRepository employeeRepository) {
		super();
		this.employeeRepository = employeeRepository;
	}


	@Override
	public Employee saveEmployee(Employee employee) {
		
		return employeeRepository.save(employee);
	}


	@Override
	public List<Employee> getAllEmployees() {
		
		return employeeRepository.findAll();
	
	}


	@Override
	public Employee getEmployeeById(long id) {
	//	Optional<Employee> employee = employeeRepository.findById(id);
	//	if(employee.isPresent()) {
	//		return employee.get();
	//	}else {
	//		throw new ResourceNotFoundException("Employee","Id","id"); //resorcename,fieldname,fieldvalue
	//	}  //in the place of if else we use lambda expression
		return employeeRepository.findById(id).orElseThrow(() ->
		                                    new ResourceNotFoundException("Employee","Id","id"));
	}


	@Override
	public Employee updateEmployee(Employee employee, long id) {
		
	Log.info("updating the record for id "+ id + "Employee" + employee.toString() )	;
	// first we check whether employee with given id is exist in DB or not
		Employee existingEmployee = employeeRepository.findById(id).orElseThrow(() -> 
		                                     new ResourceNotFoundException("Employee","Id","id"));
		existingEmployee.setFirstName(employee.getFirstName());
		existingEmployee.setLastName(employee.getLastName());
		existingEmployee.setEmail(employee.getEmail());
		existingEmployee.setAddress(employee.getAddress());
		existingEmployee.setAddressPin(employee.getAddressPin());
		existingEmployee.setGender(employee.getGender());
		existingEmployee.setMobileNo(employee.getMobileNo());
		existingEmployee.setUsername(employee.getUsername());
		                                                   //save existing employee to DB
		employeeRepository.save(existingEmployee);
		Log.info("Employee updated");
		return existingEmployee;
	}


	@Override
	public void deleteEmployee(long id) {
		employeeRepository.deleteById(id);
		//check those employee are exist are not in DB check through id
		employeeRepository.findById(id).orElseThrow(() ->
		                                                 new ResourceNotFoundException("Employee","Id","id"));
	employeeRepository.deleteById(id);	
	}
	


	
	

}
