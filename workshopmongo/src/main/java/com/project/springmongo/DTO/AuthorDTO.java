package com.project.springmongo.DTO;

import java.io.Serializable;

import com.project.springmongo.domain.User;

public class AuthorDTO implements Serializable {
	public static final long serialVersionUID = 1L;
	
	private String id;
	private String name;
	
	public AuthorDTO() {
	}

	public AuthorDTO(User obj) {
		id = obj.getId();
		name = obj.getName();
	}
	
	
}
