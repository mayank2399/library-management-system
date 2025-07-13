package com.example.library_management.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.library_management.dto.UserCreatedRequest;
import com.example.library_management.dto.UserCreatedResponse;
import com.example.library_management.enums.UserFilter;
import com.example.library_management.enums.UserStatus;
import com.example.library_management.enums.UserType;
import com.example.library_management.model.User;
import com.example.library_management.repository.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository userRepository;

	public UserCreatedResponse createStudent(UserCreatedRequest request) {
		User user = request.toUser();
		user.setUserStatus(UserStatus.ACTIVE);
		user.setUserType(UserType.STUDENT);
		User u = userRepository.save(user);
		UserCreatedResponse userCreatedResponse = new UserCreatedResponse(u.getName(), u.getEmail(), u.getPhoneNo(),
				u.getAddress());
		return userCreatedResponse;
	}

	public List<UserCreatedResponse> filter(UserFilter userFilter, String operator, String value) {
		return null;
	}

}
