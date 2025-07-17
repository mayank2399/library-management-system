package com.example.library_management.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.library_management.dto.BookCreationRequest;
import com.example.library_management.dto.BookCreationResponse;
import com.example.library_management.model.Author;
import com.example.library_management.model.Book;
import com.example.library_management.repository.BookRepository;

@Service
public class BookService {

	@Autowired
	AuthorService authorService;

	@Autowired
	BookRepository bookRepository;

	// TO be done
	public BookCreationResponse addBook(BookCreationRequest bookCreationRequest) {
		Author author = authorService.findByEmail(bookCreationRequest.getAutherEmail());
		if (author == null) {
			author = authorService.createAuthor(author);
		}

		return null;
//		Book book = bookCreationRequest.toBook();
//		Book book= bookRepository.save(null)
	}

}
