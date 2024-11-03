package com.atradius.demo.coffe.dto;

import java.io.Serializable;
import java.math.BigDecimal;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * DTO with the amount a user owes.
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserOwesDto implements Serializable {

	/***/
	private static final long serialVersionUID = 1L;

	private String userName;
	private BigDecimal owes;
}
