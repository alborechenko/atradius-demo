package com.atradius.demo.coffe.dto;

import java.io.Serializable;

import com.atradius.demo.coffe.entity.User;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserDto implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private int id;
	private String name;

	/**
	 * Constructor from entity.
	 * 
	 * @param entity
	 * @return DTO from the entity
	 */
	public UserDto(User entity) {
		this.id = entity.getId();
		this.name = entity.getName();
	}

}
