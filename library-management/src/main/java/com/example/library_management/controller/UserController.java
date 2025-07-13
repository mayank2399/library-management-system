package com.example.library_management.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.library_management.dto.UserCreatedRequest;
import com.example.library_management.dto.UserCreatedResponse;
import com.example.library_management.enums.UserFilter;
import com.example.library_management.service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {

	@Autowired
	private UserService userService;

	@PostMapping("/addstudent")
	public UserCreatedResponse addStudent(@RequestBody @Validated UserCreatedRequest user) {
		UserCreatedResponse response = userService.createStudent(user);
		return response;
	}

	@GetMapping("/filter")
	public List<UserCreatedResponse> getUserFilterByPhone(@RequestParam("filterBy") String filterBy,
			@RequestParam("operator") String operator, @RequestParam("value") String value) {
		return userService.filter(UserFilter.valueOf(filterBy), operator, value);
	}
}
