package com.example.library_management.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.library_management.model.Author;
import com.example.library_management.repository.AuthorRepository;

@Service
public class AuthorService {

	@Autowired
	private AuthorRepository autherRepository;

	public Author findByEmail(String email) {
		return autherRepository.findByEmail(email);
	}

	public Author createAuthor(Author author) {
		return autherRepository.save(author);
	}

}
