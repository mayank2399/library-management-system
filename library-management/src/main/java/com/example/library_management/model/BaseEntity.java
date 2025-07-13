package com.example.library_management.model;

import java.util.Date;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
//@Entity
public class BaseEntity {

	private Date createdDate;

	private Date updatedDate;
}
