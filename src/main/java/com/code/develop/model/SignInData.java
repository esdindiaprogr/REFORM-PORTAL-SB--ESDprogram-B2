package com.code.develop.model;

import java.util.Objects;

public class SignInData {
	
	private String email;
	private String pasword; // new password
	private String oldPassword;
	
	
	
	
	
	public String getOldPassword() {
		return oldPassword;
	}
	public void setOldPassword(String oldPassword) {
		this.oldPassword = oldPassword;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPasword() {
		return pasword;
	}
	public void setPasword(String pasword) {
		this.pasword = pasword;
	}
	@Override
	public int hashCode() {
		return Objects.hash(email, pasword);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		SignInData other = (SignInData) obj;
		return Objects.equals(email, other.email) && Objects.equals(pasword, other.pasword);
	}
	@Override
	public String toString() {
		return "LoginData [email=" + email + ", pasword=" + pasword + "]";
	}

	
	
}
