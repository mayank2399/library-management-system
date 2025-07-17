package com.example.library_management.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.library_management.model.User;

public interface UserRepository extends JpaRepository<User, Integer> {

	List<User> findByBookNo(String value);
}
