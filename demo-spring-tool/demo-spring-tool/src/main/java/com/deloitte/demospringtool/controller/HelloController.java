package com.deloitte.demospringtool.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.deloitte.demospringtool.model.Product;
import com.deloitte.demospringtool.service.ProductService;

@RestController
public class HelloController {
	@Autowired
	ProductService service;
	
	
	@PostMapping("/Products")
	public Product saveProduct(Product Product ) {
		return service.saveProduct(Product);
	

}@GetMapping("/Products")
public List<Product> getAllProducts(){
	return service.getAllProducts();
	
}
	
	@GetMapping("/Products/{pId}")
	public Product getProductById(int pId){
		return service.getProduct(pId);
		
	}
}
