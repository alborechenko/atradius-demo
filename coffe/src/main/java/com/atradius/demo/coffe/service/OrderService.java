package com.atradius.demo.coffe.service;

import java.util.List;

import com.atradius.demo.coffe.dto.OrderDto;


/**
 * Interface to expose order's services.
 * 
 */
public interface OrderService {

	/**
	 * Get the list of orders by user id.
	 * 
	 * @param userId User's id
	 * @return List of user's orders.
	 */
	public List<OrderDto> getOrdersByUserId(int userId);

}
