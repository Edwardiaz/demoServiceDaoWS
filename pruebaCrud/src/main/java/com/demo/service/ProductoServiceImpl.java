package com.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.beans.factory.annotation.Qualifier;
//import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.demo.dao.ProductoDaoImpl;
import com.demo.entity.Products;


//@Component
//@Qualifier("ProductoService")
@Service
public class ProductoServiceImpl implements ProductoService{

	private ProductoDaoImpl proDao;
	
	@Autowired
	public ProductoServiceImpl(ProductoDaoImpl proDao) {
		this.proDao = proDao;
	}
	
	@Override
	@Transactional(readOnly = true)
	public List<Products> findAll() {
		
		return (List<Products>)proDao.findAll();
	}

	@Override
	public void delete(Products id) {
		// TODO Auto-generated method stub
		
	}
}
