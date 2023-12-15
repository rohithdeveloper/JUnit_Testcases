package com.example.junit.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.junit.entity.Product;
import com.example.junit.repository.ProductRepository;
import com.example.junit.service.ProductService;

@Service
public class ProductServiceImpl implements ProductService{
	
	@Autowired
	private ProductRepository productRepo;

	@Override
	public Product saveProduct(Product product) {
		// TODO Auto-generated method stub
		product.setId(1);
		productRepo.save(product);
		return product;
	}

	@Override
	public List<Product> fetchAllProducts() {
		// TODO Auto-generated method stub
		return productRepo.findAll();
	}

	@Override
	public Product fetchProduct(int id) {
		// TODO Auto-generated method stub
		return productRepo.findById(id).get();
	}

	
}