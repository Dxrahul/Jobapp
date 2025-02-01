package com.jobportal.dto;

import com.jobportal.entity.User;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class UserDTO {
	private String id;
@NotBlank(message="Name is null or blank")
	private String name;
@NotBlank(message="email is null or blank")
	private String email;
@NotBlank(message="Password is null or blank")
	private String password;
	private AccountType accountType;

	 public UserDTO() {

	 }

	public UserDTO(String id, String name, String email, String password, AccountType accountType) {
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

	public User toEntity() {
		return new User(this.id, this.name, this.email, this.password, this.accountType);
	}
}
