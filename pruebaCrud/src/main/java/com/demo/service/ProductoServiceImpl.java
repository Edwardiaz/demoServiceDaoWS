package com.demo.service;

import java.util.List;

//import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.demo.dao.InterfaceProductoDao;
//import com.demo.dao.ProductoDaoImpl;
import com.demo.entity.Products;

@Service
public /*abstract*/ class ProductoServiceImpl implements ProductoService{

	/*@PersistenceContext
	private EntityManager em;
	private Class<T> type;*/
	private InterfaceProductoDao interProDao;
	
	//inyeccion de dependencias
//  private ProductoDaoImpl proDao;
//	@Autowired
//	public ProductoServiceImpl(ProductoDaoImpl proDao) {
//		this.proDao = proDao;
//	}
	
	@Autowired
	public ProductoServiceImpl(InterfaceProductoDao interProDao) {
		this.interProDao = interProDao;
	}
	
	//metodo guardar
	@Override
	public Products saveProducts(Products pro) {
		return interProDao.save(pro);
	}
	
	//metodo find All
	@Override
	@Transactional(readOnly = true)
	public List<Products> findAll() {
		return interProDao.findAll();
	}

	//metodo delete
	@Override
	public void delete(Long id) {
		interProDao.deleteById(id);
	}
}
