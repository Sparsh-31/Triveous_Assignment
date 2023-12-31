package com.triveous.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.triveous.Entity.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

	List<Order> findByUserId(Long userId);
}
