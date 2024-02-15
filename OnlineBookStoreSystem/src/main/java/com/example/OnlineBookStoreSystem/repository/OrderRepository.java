package com.example.OnlineBookStoreSystem.repository;

import com.example.OnlineBookStoreSystem.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {
}
