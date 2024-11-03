package com.atradius.demo.coffe.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.atradius.demo.coffe.dto.OrderDto;
import com.atradius.demo.coffe.repository.OrderRepository;
import com.atradius.demo.coffe.service.OrderService;

/**
 * Class to implements order's services.
 * 
 */
@Service
public class OrderServiceImpl implements OrderService {

	@Autowired
	OrderRepository repository;

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.atradius.demo.coffe.service.OrderService#getOrdersByUserId(int)
	 */
	@Override
	public List<OrderDto> getOrdersByUserId(int userId) {
		return repository.findOrdersByUserId(userId);
	}

}
