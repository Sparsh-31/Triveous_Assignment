package com.triveous.ServiceImplementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.triveous.Entity.Product;
import com.triveous.Exception.ProductException;
import com.triveous.Repository.ProductRepository;
import com.triveous.Service.ProductService;

public class ProductServiceImpl implements ProductService {

	 	@Autowired
	    private ProductRepository productRepository;

	    @Override
	    public List<Product> getAllProducts() throws ProductException {
	        try {
	            return productRepository.findAll();
	        } catch (Exception e) {
	            throw new ProductException("Error retrieving products: " + e.getMessage());
	        }
	    }

	    @Override
	    public List<Product> getProductsByCategoryId(Long categoryId) throws ProductException {
	        try {
	            return productRepository.findByCategoryId(categoryId);
	        } catch (Exception e) {
	            throw new ProductException("Error retrieving products by category: " + e.getMessage());
	        }
	    }

	    @Override
	    public Product getProductById(Long productId) throws ProductException {
	        try {
	            return productRepository.findById(productId)
	                    .orElseThrow(() -> new ProductException("Product not found with id: " + productId));
	        } catch (Exception e) {
	            throw new ProductException("Error retrieving product by id: " + e.getMessage());
	        }
	    }

}
