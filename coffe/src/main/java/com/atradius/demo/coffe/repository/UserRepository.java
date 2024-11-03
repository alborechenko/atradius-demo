package com.atradius.demo.coffe.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.atradius.demo.coffe.dto.UserDto;
import com.atradius.demo.coffe.entity.User;


/**
 * Interface with the queries to user's table
 *
 */
public interface UserRepository extends JpaRepository<User, Integer> {

	/**
	 * Find user's info by name.
	 * 
	 * @param userName User's name
	 * @return UserDto user's info
	 */
	@Query("select distinct new com.atradius.demo.coffe.dto.UserDto(id, name) "
			+ "from User where name = :userName")
	UserDto findUserByName(@Param("userName") String userName);

}
