package com.example.Online.Book.Store.repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Online.Book.Store.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {
}