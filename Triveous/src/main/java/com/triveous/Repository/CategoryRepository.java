package com.triveous.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.triveous.Entity.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
