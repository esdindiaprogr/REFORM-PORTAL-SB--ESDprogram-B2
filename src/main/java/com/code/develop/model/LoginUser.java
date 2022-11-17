package com.code.develop.model;

import java.util.Date; //Formatting of date. 
//import java.sql.Date; //operation on date sql.date

public class LoginUser {
	
			private String  email ;
			private String  password ;
			private String loginType ; // we are storing the complete string angel_Helper e.g AH,AI
			private Boolean forcedPasswordChange;
			private Date createdOn;
			private Date  lastUpdated_on ;
			public String getEmail() {
				return email;
			}
			public void setEmail(String email) {
				this.email = email;
			}
			public String getPassword() {
				return password;
			}
			public void setPassword(String password) {
				this.password = password;
			}
			public String getLoginType() {
				return loginType;
			}
			public void setLoginType(String loginType) {
				this.loginType = loginType;
			}
			public Boolean getForcedPasswordChange() {
				return forcedPasswordChange;
			}
			public void setForcedPasswordChange(Boolean forcedPasswordChange) {
				this.forcedPasswordChange = forcedPasswordChange;
			}
			public Date getCreatedOn() {
				return createdOn;
			}
			public void setCreatedOn(Date createdOn) {
				this.createdOn = createdOn;
			}
			public Date getLastUpdated_on() {
				return lastUpdated_on;
			}
			public void setLastUpdated_on(Date lastUpdated_on) {
				this.lastUpdated_on = lastUpdated_on;
			}
			
			
			
			
}
