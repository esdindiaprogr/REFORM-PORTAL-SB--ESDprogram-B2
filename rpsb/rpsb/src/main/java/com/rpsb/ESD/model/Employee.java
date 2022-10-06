package com.rpsb.ESD.model;

import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity (name="employee")
public class Employee {
	
	@Id    //primary key
	@GeneratedValue(strategy = GenerationType.IDENTITY)          
    private Long id;
	
	@Column(name = "first_name",nullable = false)
    private String firstName;
	
	@Column(name ="last_name")
    private String lastName;
	
	@Column(name = "email")
    private String email;
	
	@Column(name = "address")
	private String address;
	
	@Column(name = "gender")
	private String gender;
	
	@Column(name = "user_name")
	private String username;
	
	@Column(name = "mobile_no")
	private Long mobileNo;
	
	@Column(name = "address_pin")
	private Long addressPin;

	public long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public long getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(Long mobileNo) {
		this.mobileNo = mobileNo;
	}

	public long getAddressPin() {
		return addressPin;
	}

	public void setAddressPin(Long addressPin) {
		this.addressPin = addressPin;
	}

	@Override
	public int hashCode() {
		return Objects.hash(email, firstName, id, username , lastName, address, gender, addressPin, mobileNo);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return Objects.equals(email, other.email) && Objects.equals(firstName, other.firstName) && id == other.id 
			&& Objects.equals(username, other.username)	&& Objects.equals(lastName, other.lastName)
			&& Objects.equals(address, other.address) && Objects.equals(gender, other.gender) && addressPin == other.addressPin
			&& mobileNo == other.mobileNo ;
				
	}

    
}
