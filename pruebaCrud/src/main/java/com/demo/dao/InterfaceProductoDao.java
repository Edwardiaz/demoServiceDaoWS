package com.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.entity.Products;

public interface InterfaceProductoDao extends JpaRepository<Products, Long>{
	
	public Products updateProducts(Products pro);
	
	public Products findByIdProducts(Long id);
	
	
}
