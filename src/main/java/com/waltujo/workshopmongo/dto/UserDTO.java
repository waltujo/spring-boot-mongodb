package com.waltujo.workshopmongo.dto;

import java.io.Serializable;

import com.waltujo.workshopmongo.domain.User;

public class UserDTO implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private String Id;
	private String Name;
	private String Email;
	
	public UserDTO() {
	}
	
	public UserDTO(User obj) {
		Id = obj.getId();
		Name = obj.getName();
		Email = obj.getEmail();
	}

	public String getId() {
		return Id;
	}

	public void setId(String id) {
		Id = id;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}
}
