package com.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.entity.Products;

public interface InterfaceProductoDao extends JpaRepository<Products, Long>{
	
}
