package com.demo.service;

import java.util.List;

import com.demo.entity.Products;
	
public interface ProductoService {
	
	public Products saveProducts(Products pro);

	public List<Products> findAll();
	
	public Products findByIdProducts(Long id);
	
	public void delete(Long id);
	
	public Products updateProducts(Products pro);
}
