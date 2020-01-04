package com.deloitte.estore.model;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Seller_details")
public class Seller {
	
			@Id
			@Column(name="Seller_id")
			//eneratedValue(strategy=GenerationType.AUTO)
			private int SellerId;
			@Column(name="Seller_name")

			private String SellerName;
			private int gstn;
			public Seller()
			{
				
			}
			public Seller(int sellerId, String sellerName, int gstn) {
				super();
				SellerId = sellerId;
				SellerName = sellerName;
				this.gstn = gstn;
			}
			public int getSellerId() {
				return SellerId;
			}
			public void setSellerId(int sellerId) {
				SellerId = sellerId;
			}
			public String getSellerName() {
				return SellerName;
			}
			public void setSellerName(String sellerName) {
				SellerName = sellerName;
			}
			public int getGstn() {
				return gstn;
			}
			public void setGstn(int gstn) {
				this.gstn = gstn;
			}
			@Override
			public String toString() {
				return "Seller [SellerId=" + SellerId + ", SellerName=" + SellerName + ", gstn=" + gstn + "]";
			}
			
			
		



	



}


