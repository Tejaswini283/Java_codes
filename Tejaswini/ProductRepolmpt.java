package com.deloitte.estore.repo;
import java.sql.*;
import java.util.List;
import com.deloitte.estore.model.Product;


public class ProductRepolmpt implements ProductRepo {

	@Override
	public boolean addProduct(Product product) throws Exception {
		// TODO Auto-generated method stub
		Connection con=getDbConnection();
		PreparedStatement ps=con.prepareStatement("insert into product values(?,?,?)");
		ps.setInt(1, product.getProductId());
		ps.setString(2, product.getProductName());
        ps.setFloat(3, product.getPrice());
        if(ps.executeUpdate()>0) {
        	
        
		return true;
	}
		return false;
	}
	@Override
	public boolean deleteProduct(Product product) throws Exception {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean updateProduct(Product product) throws Exception {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Product getProductById(int productId) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Product> getAllProducts() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Connection getDbConnection() throws Exception {
		Connection  con=DriverManager.getConnection("jdbc:oracle:thin:@Localhost:1521:xe","system","admin");
		
		// TODO Auto-generated method stub
		return con;
	}

	
}
