package com.example.library_management.filter.user.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.library_management.filter.user.UserFilter;
import com.example.library_management.model.User;
import com.example.library_management.repository.UserRepository;

public class UserFilterByEmail implements UserFilter {

	@Autowired
	private UserRepository userRepository;

	@Override
	public List<User> getUserData(String operator, String value) {
		// TODO Auto-generated method stub
		return userRepository.findByBookNo(value);
	}

}
