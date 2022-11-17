package com.code.develop.model;

import java.util.Date;
import java.util.Objects;

public class AngelUser {
	
  
 private Long  ahId;
 private String  ahName;
 private String  ahContactNumber;
 private String  ahAddress;
 private String  ahPincode ;
 private String  ahEmail ;
 private Boolean ahType; // 1 : true 0 : false
 private String  ahProfession;
 private String  ahQualification;
 private String  ahGSTNumber_id;
 private String  ahContactPersonName ;
 private Boolean ahStatus; // 1 : true 0 : false
// private String  ahProfilePicture  BLOB(30000);  // if you want to store the 
//blob/clob object you need a function bcoz it deal with stream of datab
 private Date  ahCreated_on ;
 private Date  ahLastUpdated_on;
 private Long  ahInterestId;
 // PRIMARY KEY (ah_Id(id))
public Long getAhId() {
	return ahId;
}
public void setAhId(Long ahId) {
	this.ahId = ahId;
}
public String getAhName() {
	return ahName;
}
public void setAhName(String ahName) {
	this.ahName = ahName;
}
public String getAhContactNumber() {
	return ahContactNumber;
}
public void setAhContactNumber(String ahContactNumber) {
	this.ahContactNumber = ahContactNumber;
}
public String getAhAddress() {
	return ahAddress;
}
public void setAhAddress(String ahAddress) {
	this.ahAddress = ahAddress;
}
public String getAhPincode() {
	return ahPincode;
}
public void setAhPincode(String ahPincode) {
	this.ahPincode = ahPincode;
}
public Boolean getAhType() {
	return ahType;
}
public void setAhType(Boolean ahType) {
	this.ahType = ahType;
}
public String getAhProfession() {
	return ahProfession;
}
public void setAhProfession(String ahProfession) {
	this.ahProfession = ahProfession;
}
public String getAhQualification() {
	return ahQualification;
}
public void setAhQualification(String ahQualification) {
	this.ahQualification = ahQualification;
}
public String getAhGSTNumber_id() {
	return ahGSTNumber_id;
}
public void setAhGSTNumber_id(String ahGSTNumber_id) {
	this.ahGSTNumber_id = ahGSTNumber_id;
}
public String getAhContactPersonName() {
	return ahContactPersonName;
}
public void setAhContactPersonName(String ahContactPersonName) {
	this.ahContactPersonName = ahContactPersonName;
}
public Boolean getAhStatus() {
	return ahStatus;
}
public void setAhStatus(Boolean ahStatus) {
	this.ahStatus = ahStatus;
}
public Date getAhCreated_on() {
	return ahCreated_on;
}
public void setAhCreated_on(Date ahCreated_on) {
	this.ahCreated_on = ahCreated_on;
}
public Date getAhLastUpdated_on() {
	return ahLastUpdated_on;
}
public void setAhLastUpdated_on(Date ahLastUpdated_on) {
	this.ahLastUpdated_on = ahLastUpdated_on;
}
public String getAhEmail() {
	return ahEmail;
}
public void setAhEmail(String ahEmail) {
	this.ahEmail = ahEmail;
}
public Long getAhInterestId() {
	return ahInterestId;
}
public void setAhInterestId(Long ahInterestId) {
	this.ahInterestId = ahInterestId;
}
@Override
public int hashCode() {
	return Objects.hash(ahEmail, ahId);
}
@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	AngelUser other = (AngelUser) obj;
	return Objects.equals(ahEmail, other.ahEmail) && Objects.equals(ahId, other.ahId);
}
	
	

}
