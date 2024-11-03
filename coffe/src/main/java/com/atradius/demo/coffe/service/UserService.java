package com.atradius.demo.coffe.service;

import java.util.List;

import com.atradius.demo.coffe.dto.UserDto;

/**
 * Interface to expose user's services.
 * 
 */
public interface UserService {

	/** 
	 * Get the list of users
	 * 
	 * @return
	 */
	public List<UserDto> getUsers();

	/**
	 * Get user by the parameter name.
	 * 
	 * @param name User's name.
	 * @return User's info.
	 */
	public UserDto getUserByName(String name);
	
}
