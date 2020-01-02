package com.deloitte.estore.applications;

import com.deloitte.estore.model.Product;
import com.deloitte.estore.service.ProductService;
import com.deloitte.estore.service.ProductServiceimpl;

public class DeloitteEStroreApp {
public static void main(String[] args) {
	ProductService service=new ProductServiceimpl();
    Product p=new Product(10,"MOBILE",40000);
    try{
    	if(service.addProduct(p))
    	{
    		System.out.println("Product added");
    	}
    	else {
    	System.out.println("not added");
         }
    }
catch(Exception e) {
	e.printStackTrace();
}
    }
}
