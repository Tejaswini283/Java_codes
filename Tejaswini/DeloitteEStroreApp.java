package com.deloitte.estore.applications;





import java.util.List;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.Transaction;
import com.deloitte.estore.model.Product;
import com.deloitte.estore.model.Seller;
import com.deloitte.estore.service.ProductService;
import com.deloitte.estore.service.ProductServiceimpl;

public class DeloitteEStroreApp{
	

	public static void main(String[] args) {
		SessionFactory sf=new Configuration()
				            .configure()
		                    .addAnnotatedClass(Product.class)
		                    .addAnnotatedClass(Seller.class)
                    .buildSessionFactory();
		
		Session ssn=sf.openSession();
		
	Transaction tx=ssn.beginTransaction();	
	Seller s=new Seller(26,"o",40); 
	Product p=new Product(17,"p",60,s);

		Query q=ssn.createQuery("from Product");
		List<Product> product=q.getResultList();
		product.forEach(System.out::println);
		ssn.save(p);
		ssn.save(s);
		tx.commit();
		ssn.close();
//		Product product =new Product(12,"k",70000);
//		Session ssn=sf.openSession();
//		Transaction tx=ssn.beginTransaction();
//		ssn.save(product);
//		tx.commit();
	}
}