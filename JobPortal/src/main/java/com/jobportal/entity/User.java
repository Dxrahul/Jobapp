package com.jobportal.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import com.jobportal.dto.AccountType;
import com.jobportal.dto.UserDTO;

import lombok.Data;

@Data
@Document(collection ="users")
public class User {
	@Id
	private String id;
	private String name;
	@Indexed(unique = true)
	private String email;
	private String password;
	private AccountType accountType;

	 public User() {
	   }


	public User(String id, String name, String email, String password, AccountType accountType) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.password = password;
		this.accountType = accountType;
	}



	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
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


	public AccountType getAccountType() {
		return accountType;
	}


	public void setAccountType(AccountType accountType) {
		this.accountType = accountType;
	}


	public UserDTO toDTO() {
		return new UserDTO(this.id, this.name, this.email, this.password, this.accountType);
	}
}
