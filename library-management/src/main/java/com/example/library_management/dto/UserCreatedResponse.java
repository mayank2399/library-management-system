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
public class UserCreatedResponse {

	private String userName;
	private String userEmail;
	private String userPhoneNO;
	private String userAddress;

}
