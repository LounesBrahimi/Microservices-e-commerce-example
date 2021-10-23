package com.ecomerceexample.microcommerce.dao;

import java.util.List;
import com.ecomerceexample.microcommerce.model.Product;

public interface ProductDao {
	/*
	 * Return all products available
	 * */
	public List<Product> findAll();
	
	public Product findProductById(int id);
	
	public Product save(Product product);
}
