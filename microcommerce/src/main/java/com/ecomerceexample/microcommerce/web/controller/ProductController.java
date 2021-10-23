package com.ecomerceexample.microcommerce.web.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.ecomerceexample.microcommerce.model.Product;

@RestController
public class ProductController {

	/*
	 * Method that answers to product/{id}
	 * */
	@GetMapping(value = "Product/{id}")
	public Product printAProduct(@PathVariable int id) {
		// We have not yet a data base so we return a new product
		return new Product(id, "Head and Shoulders", 7);
	}	
}
