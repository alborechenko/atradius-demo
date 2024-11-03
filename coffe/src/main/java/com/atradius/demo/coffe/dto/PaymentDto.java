package com.atradius.demo.coffe.dto;

import java.io.Serializable;
import java.math.BigDecimal;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PaymentDto implements Serializable {

	/***/
	private static final long serialVersionUID = 1L;

	private int id;
	private int userId;
	private BigDecimal amount;

}
