package com.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.demo.dao.InterfaceCategoryDao;
import com.demo.dao.InterfaceProCatDao;
import com.demo.entity.Category;
import com.demo.entity.ProductsCategory;

@Service
public class CategoryServiceImpl implements CategoryService{

	private InterfaceCategoryDao interCatDao;
	
	private InterfaceProCatDao interProCatDao;
	
	@Autowired
	public CategoryServiceImpl(InterfaceCategoryDao interCatDao, InterfaceProCatDao interProCatDao) {
		this.interCatDao = interCatDao;
		this.interProCatDao = interProCatDao;
	}
	//CRUD

	@Override
	public Category saveCategory(Category cat) {
		return interCatDao.saveCategory(cat);
	}

	@Override
	@Transactional(readOnly = true)
	public List<Category> findAllCategory() {
		return interCatDao.findAllCategory();
	}

	@Override
	@Transactional(readOnly = true)
	public Category findByIdCategory(Long id) {
		return interCatDao.findByIdCategory(id);
	}

	@Override
	public void deleteCategory(Long id) {
		interCatDao.deteleCategory(id);
	}

	@Override
	public Category updateCategory(Category cat) {
		return interCatDao.updateCategory(cat);
	}
	// ********************************************* \\

	@Override
	public ProductsCategory saveProductsCategory(ProductsCategory cat) {
		return interProCatDao.saveProCat(cat);
	}

	@Override
	@Transactional(readOnly = true)
	public List<ProductsCategory> findAllProductsCategory() {
		return interProCatDao.findAllProCat();
	}

	@Override
	@Transactional(readOnly = true)
	public ProductsCategory findByIdProductsCategory(Long id) {
		return interProCatDao.findByIdProCat(id);
	}

	@Override
	public void deleteProductsCategory(Long id) {
		interProCatDao.deleteProCat(id);
	}

	@Override
	public ProductsCategory updateProductsCategory(ProductsCategory cat) {
		return interProCatDao.updateProCat(cat);
	}
	
	
}
