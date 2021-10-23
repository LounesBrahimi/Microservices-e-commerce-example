package com.ecomerceexample.microcommerce.dao;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Repository;
import com.ecomerceexample.microcommerce.model.Product;

@Repository
public class ProductDaoImpl implements ProductDao{

	public static List<Product> products = new ArrayList<Product>();
	
	static {
		products.add(new Product(1, "dell Camputer", 1000));
		products.add(new Product(2, "apple Camputer", 1500));
		products.add(new Product(3, "iphone 13", 1500));
	}
	
	@Override
	public List<Product> findAll() {
		return products;
	}

	@Override
	public Product findProductById(int id) {
        for (Product product : products) {  
            if(product.getId() ==id){
                return product;
            }
        }
        return null;
	}

	@Override
	public Product save(Product product) {
        products.add(product);
        return product;
	}
}
