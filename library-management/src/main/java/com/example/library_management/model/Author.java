package com.example.library_management.model;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.IdClass;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

@Entity
@Setter
@Getter
@IdClass(AutherCompositeKey.class)
public class Author extends BaseEntity {

	@Id
	private String id;

	@Id
	@Column(nullable = false,unique = true)
	private String email;

	
	private String autherName;

	private String phoneNo;

//	private String email;

	@OneToMany(mappedBy = "author")
//	@JoinColumn
	private List<Book> books;

}
