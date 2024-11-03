package com.atradius.demo.coffe.dto;

import java.io.Serializable;
import java.math.BigDecimal;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * DTO with user's total amount.
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserPaymensTotalDto implements Serializable {

	/***/
	private static final long serialVersionUID = 1L;

	private int userId;
	private BigDecimal total;
}
