package com.demo.service;

import java.util.List;

//import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.beans.factory.annotation.Qualifier;
//import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.demo.dao.InterfaceProductoDao;
//import com.demo.dao.ProductoDaoImpl;
import com.demo.entity.Products;

@Service
public /*abstract*/ class ProductoServiceImpl/*<T>*/ implements ProductoService{

	/*private EntityManager em;
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
	
	//metodo find All
	@Override
	@Transactional(readOnly = true)
	public List<Products> findAll() {
		return (List<Products>)interProDao.findAll();
	}

	//metodo delete
	@Override
	public void delete(Long id) {
		interProDao.deleteById(id);
	}
}
