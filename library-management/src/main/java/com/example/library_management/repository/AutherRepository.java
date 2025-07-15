package com.example.library_management.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.library_management.model.AutherCompositeKey;
import com.example.library_management.model.Author;

public interface AutherRepository extends JpaRepository<Author, AutherCompositeKey> {

}
