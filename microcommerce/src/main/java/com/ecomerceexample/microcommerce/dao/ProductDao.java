package com.ecomerceexample.microcommerce.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ecomerceexample.microcommerce.model.Product;

@Repository
public interface ProductDao extends JpaRepository<Product, Integer>{
	public Product findProductById(int id);
}
