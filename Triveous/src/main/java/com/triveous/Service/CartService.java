package com.triveous.Service;

import java.util.List;

import com.triveous.Entity.Cart;
import com.triveous.Entity.Product;
import com.triveous.Exception.CartException;

public interface CartService {

	List<Cart> getAllCarts() throws CartException;
    void addToCart(Cart cart) throws CartException;
    void deleteFromCart(Long cartId, Long productId) throws CartException;
    List<Product> getAllItemsInCart(Long cartId) throws CartException;
}
