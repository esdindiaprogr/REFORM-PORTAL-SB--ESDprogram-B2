package com.rpsb.ESD.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rpsb.ESD.model.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long>{

}
