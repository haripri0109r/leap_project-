package com.example.Online.Book.Store.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Online.Book.Store.entity.Book;

@Repository
public interface BookRepository extends JpaRepository<Book, Long> {
    
}
