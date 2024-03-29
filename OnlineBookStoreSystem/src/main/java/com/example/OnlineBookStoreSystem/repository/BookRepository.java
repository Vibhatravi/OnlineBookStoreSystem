package com.example.OnlineBookStoreSystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.OnlineBookStoreSystem.model.Book;

@Repository
public interface BookRepository extends JpaRepository<Book, Long>{

}
