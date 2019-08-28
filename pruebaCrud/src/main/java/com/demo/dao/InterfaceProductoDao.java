package com.demo.dao;

import org.springframework.data.repository.CrudRepository;

import com.demo.entity.Products;


public interface InterfaceProductoDao extends CrudRepository<Products, Long>{
	
}
