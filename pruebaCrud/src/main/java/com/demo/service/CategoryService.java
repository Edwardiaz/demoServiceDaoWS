package com.demo.service;

import java.util.List;

import com.demo.entity.Category;
import com.demo.entity.ProductsCategory;

public interface CategoryService {

	public Category saveCategory(Category cat);

	public List<Category> findAllCategory();

	public Category findByIdCategory(Long id);

	public void deleteCategory(Long id);

	public Category updateCategory(Category cat);

	// *********************************************** \\

	public ProductsCategory saveProductsCategory(ProductsCategory cat);

	public List<ProductsCategory> findAllProductsCategory();

	public ProductsCategory findByIdProductsCategory(Long id);

	public void deleteProductsCategory(Long id);

	public ProductsCategory updateProductsCategory(ProductsCategory cat);
}
