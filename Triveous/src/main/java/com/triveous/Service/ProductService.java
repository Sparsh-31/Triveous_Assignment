package com.triveous.Service;

import java.util.List;

import com.triveous.Entity.Product;
import com.triveous.Exception.ProductException;

public interface ProductService {

	List<Product> getAllProducts() throws ProductException;
    List<Product> getProductsByCategoryId(Long categoryId) throws ProductException;
    Product getProductById(Long productId) throws ProductException;
}
