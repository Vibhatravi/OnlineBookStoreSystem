package com.example.OnlineBookStoreSystem.service;

import com.example.OnlineBookStoreSystem.model.Cart;
import com.example.OnlineBookStoreSystem.repository.CartRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CartService {

    private final CartRepository cartRepository;

    @Autowired
    public CartService(CartRepository cartRepository) {
        this.cartRepository = cartRepository;
    }

    public Optional<Cart> getCartById(Long id) {
        return cartRepository.findById(id);
    }

    public Cart createCart(Cart cart) {
        return cartRepository.save(cart);
    }

    public Cart updateCart(Long id, Cart updatedCart) {
        if (cartRepository.existsById(id)) {
            updatedCart.setId(id);
            return cartRepository.save(updatedCart);
        }
        return null;
    }

    public boolean deleteCart(Long id) {
        if (cartRepository.existsById(id)) {
            cartRepository.deleteById(id);
            return true;
        }
        return false;
    }
}
