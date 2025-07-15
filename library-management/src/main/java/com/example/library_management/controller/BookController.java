package com.example.library_management.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.library_management.dto.BookCreationRequest;
import com.example.library_management.dto.BookCreationResponse;
import com.example.library_management.dto.UserCreatedResponse;
import com.example.library_management.service.BookService;

@RestController
@RequestMapping("/book")
public class BookController {

	@Autowired
	private BookService bookService;

	@PostMapping("/addbook")
	public BookCreationResponse addbook(@RequestBody @Validated BookCreationRequest book) {
		BookCreationResponse response = bookService.addBook(book);
		return response;
	}

}
