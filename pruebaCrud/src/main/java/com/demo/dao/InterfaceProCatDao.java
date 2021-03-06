package com.demo.dao;

import java.util.List;

import com.demo.entity.ProductsCategory;

public interface InterfaceProCatDao{

	public ProductsCategory updateProCat(ProductsCategory pro);

	public ProductsCategory findByIdProCat(Long id);

	public ProductsCategory saveProCat(ProductsCategory cat);

	public List<ProductsCategory> findAllProCat();

	public void deleteProCat(Long id);

	
}
