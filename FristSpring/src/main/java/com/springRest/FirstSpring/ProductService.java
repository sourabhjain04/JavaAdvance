package com.springRest.FirstSpring;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;
@Service
public class ProductService implements IProductService{

	@Override
	public List<Product> findAll() {
	
		ArrayList<Product> products = new ArrayList<Product>();
		products.add(new Product(100, "Mobile", "CLK98123", 9000.00, 6));
		products.add(new Product(101, "Smart TV", "LGST09167", 60000.00, 3));
		products.add(new Product(102, "Washing Machine", "38753BK9", 9000.00, 7));
		products.add(new Product(103, "Laptop", "LHP29OCP", 24000.00, 1));
		products.add(new Product(104, "Air Conditioner", "ACLG66721", 30000.00, 5));
		products.add(new Product(105, "Refrigerator ", "12WP9087", 10000.00, 4));
		
		
		return products;
	}

	
	
	
}
