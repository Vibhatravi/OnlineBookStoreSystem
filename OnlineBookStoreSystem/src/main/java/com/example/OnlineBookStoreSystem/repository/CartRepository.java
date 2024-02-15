package com.example.OnlineBookStoreSystem.repository;

import com.example.OnlineBookStoreSystem.model.Cart;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CartRepository extends JpaRepository<Cart, Long> {
	
}
