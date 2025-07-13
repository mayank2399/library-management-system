package com.example.library_management.dto;

import com.example.library_management.model.User;

import jakarta.validation.constraints.NotBlank;
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
public class UserCreatedRequest {

	@NotBlank(message = "Username cannot be empty")
	private String userName;
	private String userEmail;
	private String userPhoneNO;
	private String userAddress;

	public User toUser() {
		User user = User.builder().name(this.userName).email(userEmail).phoneNo(userPhoneNO).address(userAddress)
				.build();
		return user;
	}

}
