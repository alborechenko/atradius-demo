package com.atradius.demo.coffe.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.atradius.demo.coffe.dto.PaymentDto;
import com.atradius.demo.coffe.entity.Payment;

/**
 * Interface with the queries to payment's table
 *
 */
public interface PaymentRepository extends JpaRepository<Payment, Integer> {

	/**
	 * Find payments of one user.
	 * 
	 * @param userName User's name
	 * @return UserDto user's info
	 */
	@Query("select distinct new com.atradius.demo.coffe.dto.PaymentDto(pay.id, usr.id, pay.amount) "
			+ "from Payment pay join pay.user usr where usr.id = :userId")
	List<PaymentDto> findPaymentsByUserId(@Param("userId") int userId);

}
