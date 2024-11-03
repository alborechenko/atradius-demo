package com.atradius.demo.coffe.service;

import java.util.List;

import com.atradius.demo.coffe.dto.ProductDto;

/**
 * Interface to expose product's services.
 * 
 */
public interface ProductService {

	/** 
	 * Get the list of products
	 * 
	 * @return
	 */
	public List<ProductDto> getProducts();

	/**
	 * Get product by id.
	 * 
	 * @param productId Product's id.
	 * @return Product's info.
	 */
	public ProductDto getProductById(int productId);

	/**
	 * Get product by id.
	 * 
	 * @param name Product's name.
	 * @return Product's info.
	 */
	public ProductDto getUserByName(String name);

}
