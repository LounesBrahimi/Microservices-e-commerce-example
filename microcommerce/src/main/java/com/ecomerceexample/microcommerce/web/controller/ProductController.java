package com.ecomerceexample.microcommerce.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.ecomerceexample.microcommerce.dao.ProductDao;
import com.ecomerceexample.microcommerce.model.Product;

@RestController
public class ProductController {

	@Autowired
	private ProductDao productDao;
	
	/*
	 * all the products
	 * */
	@GetMapping(value = "Products")
	public List<Product> listPorducts() {
		return productDao.findAll();
	}
	
	/*
	 * Method that answers to product/{id}
	 * */
	@GetMapping(value = "Product/{id}")
	public Product printAProduct(@PathVariable int id) {
		// We have not yet a data base so we return a new product
		return productDao.findProductById(id);
	}	
}
