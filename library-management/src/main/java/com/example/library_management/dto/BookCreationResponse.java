package com.example.library_management.dto;

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
public class BookCreationResponse {

	private String bookTitle;
	private Double securityAmount;
	private String bookNo;
	private String autherName;
	private String autherEmail;
}
