package com.deloitte.demospringtool.service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.deloitte.demospringtool.repo.ProductRepo;
import com.deloitte.demospringtool.model.Product;

@Service
public class ProductService {
	@Autowired
	ProductRepo repo;
	
	public Product saveProduct(Product Product) {
		return repo.save(Product);
	}
	public List<Product> getAllProducts(){
		return repo.findAll();
	}
public Product getProduct(int pId) {
	return repo.getOne(pId);
}
}
