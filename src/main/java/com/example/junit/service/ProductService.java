package com.example.junit.service;

import java.util.List;

import com.example.junit.entity.Product;

public interface ProductService {
	 Product saveProduct(Product product);
	 List<Product> fetchAllProducts();
	 Product fetchProduct(int id);
}
