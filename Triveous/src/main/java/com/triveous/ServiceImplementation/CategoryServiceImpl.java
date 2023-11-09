package com.triveous.ServiceImplementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.triveous.Entity.Category;
import com.triveous.Entity.Product;
import com.triveous.Exception.CategoryException;
import com.triveous.Repository.CategoryRepository;
import com.triveous.Repository.ProductRepository;
import com.triveous.Service.CategoryService;

public class CategoryServiceImpl implements CategoryService {

	@Autowired
    private CategoryRepository categoryRepository;

    @Autowired
    private ProductRepository productRepository;

    @Override
    public List<Category> getAllCategories() throws CategoryException {
        try {
            return categoryRepository.findAll();
        } catch (Exception e) {
            throw new CategoryException("Error getting all categories"+ e.getMessage());
        }
    }

    @Override
    public List<Product> getAllProductsByCategoryId(Long categoryId) throws CategoryException {
        try {
            return productRepository.findByCategoryId(categoryId);
        } catch (Exception e) {
            throw new CategoryException("Error getting products for category with id: " + categoryId+" "+ e.getMessage());
        }
    }

}
