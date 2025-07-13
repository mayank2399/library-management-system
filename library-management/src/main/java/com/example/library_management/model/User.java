package com.example.library_management.model;

import java.util.List;

import com.example.library_management.enums.UserStatus;
import com.example.library_management.enums.UserType;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Builder
public class User extends BaseEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	@Column(length = 251)
	private String name;

	@Column(length = 12, unique = true)
	private String phoneNo;

	@Column(length = 20)
	private String email;

	private String address;

	@Enumerated
	private UserType userType;

	@Enumerated
	private UserStatus userStatus;

	@OneToMany(mappedBy = "user")
	private List<Book> book;

	@OneToMany(mappedBy = "user")
	private List<Transaction> transaction;

}
