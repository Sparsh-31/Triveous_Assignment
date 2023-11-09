package com.triveous.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.triveous.Entity.Cart;

public interface CartRepository extends JpaRepository<Cart, Long> {

}
