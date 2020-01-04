package com.deloitte.estore.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="product_details")
public class Product {

	
	@Id
	@Column(name="product_id")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int ProductId;
	@Column(name="product_name", nullable=false, unique= true)

	private String ProductName;
	
	private float Price;
	
	@OneToOne
	Seller s=new Seller(); 
	
	
	
	public Product() {
	
	}
	
	public Product(int productId, String productName, float price, Seller s) {
		super();
		ProductId = productId;
		ProductName = productName;
		Price = price;
		this.s = s;
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

	public Seller getS() {
		return s;
	}

	public void setS(Seller s) {
		this.s = s;
	}

	@Override
	public String toString() {
		return "Product [ProductId=" + ProductId + ", ProductName=" + ProductName + ", Price=" + Price + ", s=" + s
				+ "]";
	}

	
}
