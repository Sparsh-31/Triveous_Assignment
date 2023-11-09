package com.triveous.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.triveous.Entity.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
	List<Product> findByCategoryId(Long categoryId);
}
