package com.example.accessingdatajpa.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "employee")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;

    //...

    @OneToOne(cascade = CascadeType.ALL)
    @JoinTable(name = "emp_workstation", 
      joinColumns = {@JoinColumn(name="employee_id",referencedColumnName="id")},
                inverseJoinColumns =
            {@JoinColumn (name="workstation_id", referencedColumnName= "id") } )
    private WorkStation workStation;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public WorkStation getWorkStation() {
		return workStation;
	}

	public void setWorkStation(WorkStation workStation) {
		this.workStation = workStation;
	}

   
}
