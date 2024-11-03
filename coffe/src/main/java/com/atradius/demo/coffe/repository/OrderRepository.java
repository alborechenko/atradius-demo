package com.atradius.demo.coffe.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.atradius.demo.coffe.dto.OrderDto;
import com.atradius.demo.coffe.entity.Order;

/**
 * Interface with the queries to order's table
 *
 */
public interface OrderRepository extends JpaRepository<Order, Integer> {

	/**
	 * Find orders of a user.
	 * 
	 * @param userName User's name
	 * @return UserDto user's info
	 */
	@Query("select distinct new com.atradius.demo.coffe.dto.OrderDto(ord.id, usr.id, usr.name, prod.id, prod.name, ord.size, pri.price) "
			+ "from Order ord join ord.user usr join ord.product prod join prod.prodPrice pri "
			+ "where ord.user.id = :userId and pri.size = ord.size")
	List<OrderDto> findOrdersByUserId(@Param("userId") int userId);

}
