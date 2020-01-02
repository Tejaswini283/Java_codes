package com.deloitte.estore.model;

public class Product {
	private int ProductId;
	private String ProductName;
	private float Price;
	private Product() {
		
	}
	public Product(int productId, String productName, float price) {
		super();
		ProductId = productId;
		ProductName = productName;
		Price = price;
	}
	public int getProductId() {
		return ProductId;
	}
	public void setProductId(int productId) {
		ProductId = productId;
	}
	public String getProductName() {
		return ProductName;
	}
	public void setProductName(String productName) {
		ProductName = productName;
	}
	public float getPrice() {
		return Price;
	}
	public void setPrice(float price) {
		Price = price;
	}


}
