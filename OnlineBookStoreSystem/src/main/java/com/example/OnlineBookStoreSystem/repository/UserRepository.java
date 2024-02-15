package com.example.OnlineBookStoreSystem.repository;

import com.example.OnlineBookStoreSystem.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
	
}
