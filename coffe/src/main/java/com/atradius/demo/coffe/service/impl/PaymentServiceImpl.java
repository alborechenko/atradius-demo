package com.atradius.demo.coffe.service.impl;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.atradius.demo.coffe.constants.Constants.ResponseInfo;
import com.atradius.demo.coffe.dto.OrderDto;
import com.atradius.demo.coffe.dto.PaymentDto;
import com.atradius.demo.coffe.dto.UserDto;
import com.atradius.demo.coffe.dto.UserOwesDto;
import com.atradius.demo.coffe.exceptions.UserDoesNotExistException;
import com.atradius.demo.coffe.repository.PaymentRepository;
import com.atradius.demo.coffe.service.OrderService;
import com.atradius.demo.coffe.service.PaymentService;
import com.atradius.demo.coffe.service.UserService;

/**
 * Class to implements payments' services.
 * 
 */
@Service
public class PaymentServiceImpl implements PaymentService {

	@Autowired(required = false)
	UserService userService;

	@Autowired(required = false)
	OrderService orderService;
	
	@Autowired
	PaymentRepository repository;

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.atradius.demo.coffe.service.PaymentService#getPaymentsByUserId(int)
	 */
	@Override
	public List<PaymentDto> getPaymentsByUserId(int userId) {
		List<PaymentDto> payments = new ArrayList<>();

		payments = repository.findPaymentsByUserId(userId);
		
		return payments;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.atradius.demo.coffe.service.PaymentService#getPaymentsTotalByUser(java.
	 * lang.String)
	 */
	@Override
	public BigDecimal getPaymentsTotalByUser(String userName) throws UserDoesNotExistException {
		UserDto user = userService.getUserByName(userName);
		BigDecimal paymentstotal = BigDecimal.ZERO;

		if (user == null) {
			throw new UserDoesNotExistException(userName + ResponseInfo.USER_NOT_EXISTS);
		} else {
			List<PaymentDto> payments = this.getPaymentsByUserId(user.getId());
			paymentstotal = payments.stream().map(PaymentDto::getAmount).reduce(BigDecimal.ZERO, BigDecimal::add);
		}

		return paymentstotal;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.atradius.demo.coffe.service.PaymentService#getPaymentsUsersOwes()
	 */
	@Override
	public List<UserOwesDto> getPaymentsUsersOwes() {
		List<UserDto> users = userService.getUsers();
		List<UserOwesDto> usersOwes = new ArrayList<>();

		for (UserDto user : users) {
			// We obtain the total amount for this user
			BigDecimal totalPayed = this.getPaymentsByUserId(user.getId()).stream().map(PaymentDto::getAmount)
					.reduce(BigDecimal.ZERO, BigDecimal::add);

			// We obtain the total orders' amount for this user
			BigDecimal totalRequested = orderService.getOrdersByUserId(user.getId()).stream().map(OrderDto::getPrice)
					.reduce(BigDecimal.ZERO, BigDecimal::add);

			usersOwes.add(new UserOwesDto(user.getName(), totalRequested.subtract(totalPayed)));
		}

		return usersOwes;
	}

}
