package com.atradius.demo.coffe.entity;

import java.math.BigDecimal;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "productprices")
@Data
public class ProductPrice {

	@Id
	@Column(name = "id", nullable = false)
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	@Column(name = "price", precision = 3, scale = 2)
	private BigDecimal price;
	
	@Column(name = "size")
	private String size;
	
	@ManyToOne
	@JoinColumn(name = "productid")
	Product product;
}
