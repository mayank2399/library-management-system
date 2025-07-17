package com.example.library_management.filter.user;

import java.util.List;

import org.springframework.stereotype.Component;

import com.example.library_management.model.User;

@Component
public interface UserFilter {

	public List<User> getUserData(String operator, String value);
	
}
