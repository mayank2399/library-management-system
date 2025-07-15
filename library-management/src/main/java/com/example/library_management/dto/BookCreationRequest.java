package com.example.library_management.dto;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class BookCreationRequest {

	@NotNull(message = "book title cannot be null or empty")
	private String bookTitle;

	@Positive
	private Double securityAmount;

	private String bookNo;

	private String autherName;
	private String autherEmail;
}
