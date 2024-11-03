package com.atradius.demo.coffe.dto;

import java.math.BigDecimal;
import java.util.HashMap;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProductDto {

	private int id;
	private String drinkName;
	private HashMap<String, BigDecimal> prices;
	
}
