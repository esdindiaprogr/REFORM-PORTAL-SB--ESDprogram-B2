package com.example.accessingdatajpa.model;


import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.stereotype.Component;



@Component
@Entity (name = "ESD_USER")
public class User {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;
	@Column (name="email")
	private String email;
	
	@Column (name="password")
	private String password;
	
	
	@Column(name ="newUser")
	private Boolean newUser = Boolean.TRUE;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

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

	public Boolean getNewUser() {
		return newUser;
	}

	public void setNewUser(Boolean newUser) {
		this.newUser = newUser;
	}

	@Override
	public int hashCode() {
		return Objects.hash(email, id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		return Objects.equals(email, other.email) && Objects.equals(id, other.id);
	}
/*	
@PostConstruct
private void postConstructMethod() {
	
			
	byte[] array = new byte[8]; // length is bounded by 8
    new Random().nextBytes(array);
    String password = new String(array, Charset.forName("UTF-8"));

    System.out.println(password);
	
    }
*/
	
}
