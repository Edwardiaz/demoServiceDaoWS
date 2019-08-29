package com.demo.service;

import java.util.List;

import com.demo.entity.Products;


public interface ProductoService {

	public List<Products> findAll();
	
	public void delete(Long id);
}
