package com.example.library_management.model;

import com.example.library_management.enums.TransactionStatus;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Transaction {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	private String transactionId;

	private TransactionStatus transactionStatus;

	private Integer settlementAmount;

	@ManyToOne
	@JoinColumn
	private Book book;

	@ManyToOne
	@JoinColumn
	private User user;

	private String orderId;

}
