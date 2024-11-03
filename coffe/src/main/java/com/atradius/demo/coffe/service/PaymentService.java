package com.atradius.demo.coffe.service;

import java.math.BigDecimal;
import java.util.List;

import com.atradius.demo.coffe.dto.PaymentDto;
import com.atradius.demo.coffe.dto.UserOwesDto;
import com.atradius.demo.coffe.exceptions.UserDoesNotExistException;

/**
 * Interface to expose payment's services.
 * 
 */
public interface PaymentService {
	
	/**
	 * Get the list of payments by user id.
	 * 
	 * @param userId User id.
	 * @return List of payments.
	 */
	List<PaymentDto> getPaymentsByUserId(int userId);

	/**
	 * Get the payments total of a user.
	 * 
	 * @param userId User name.
	 * @return Total payment's amount by user.
	 */
	public BigDecimal getPaymentsTotalByUser(String userName) throws UserDoesNotExistException;

	/**
	 * Get a list with the users' owes
	 * 
	 * @return Total payment's amount by user.
	 */
	public List<UserOwesDto> getPaymentsUsersOwes();

}
