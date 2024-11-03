package com.atradius.demo.coffe.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.atradius.demo.coffe.dto.UserDto;
import com.atradius.demo.coffe.entity.User;
import com.atradius.demo.coffe.repository.UserRepository;
import com.atradius.demo.coffe.service.UserService;

/**
 * Class to implements user's services.
 * 
 */
@Service
public class UserServiceImpl implements UserService {

	@Autowired
	UserRepository repository;

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.atradius.demo.coffe.service.UserService#getUsers()
	 */
	@Override
	public List<UserDto> getUsers() {
		List<UserDto> usersDto = new ArrayList<>();
		
		List<User> users = repository.findAll();
		
		for(User entity:users) {
			usersDto.add(new UserDto(entity));
		}
		
		return usersDto;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.atradius.demo.coffe.service.UserService#getUserByName(java.lang.String)
	 */
	@Override
	public UserDto getUserByName(String name) {
		return repository.findUserByName(name);
	}

}
