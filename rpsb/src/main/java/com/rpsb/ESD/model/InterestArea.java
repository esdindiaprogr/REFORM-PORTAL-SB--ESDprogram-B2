package com.rpsb.ESD.model;

import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;



@Entity (name="interestArea")
public class InterestArea {
	
	@Id        //primary key
	@GeneratedValue(strategy = GenerationType.AUTO) 
	private Long id;
	
	private String areaName;
	private String interestAreadetail;


	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getAreaName() {
		return areaName;
	}
	public void setAreaName(String areaName) {
		this.areaName = areaName;
	}
	public String getInterestArea() {
		return interestAreadetail;
	}
	
    public String getInterestAreadetail() {
		return interestAreadetail;
	}
	public void setInterestAreadetail(String interestAreadetail) {
		this.interestAreadetail = interestAreadetail;
	}
@Override
public int  hashCode(){
  return Objects.hash(areaName, interestAreadetail,id);
}

	
	@Override
  public boolean equals(Object obj){
if (this== obj)
  return true;
if (obj == null)
  return false;
if (getClass() !=obj.getClass())
return false;
InterestArea other = (InterestArea) obj;
return Objects.equals(areaName, other.areaName) && Objects.equals(interestAreadetail, other.interestAreadetail)&& Objects.equals(id,other.id);


}
}
