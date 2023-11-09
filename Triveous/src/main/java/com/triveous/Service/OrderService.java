package com.triveous.Service;

import java.util.List;

import com.triveous.Entity.Order;
import com.triveous.Exception.OrderException;

public interface OrderService {

	List<Order> getOrdersByUserId(Long userId) throws OrderException;
    void placeOrder(Order order) throws OrderException;
    Order getOrderById(Long orderId) throws OrderException;
}
