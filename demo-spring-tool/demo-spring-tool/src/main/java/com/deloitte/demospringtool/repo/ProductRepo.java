package com.deloitte.demospringtool.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.deloitte.demospringtool.model.Product;
@Repository
public interface ProductRepo  extends JpaRepository <Product,Integer>{
	

}
