package com.example.library_management.filter.user;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Component;

import com.example.library_management.enums.UserFilterTypes;
import com.example.library_management.filter.user.impl.UserFilterByEmail;
import com.example.library_management.filter.user.impl.UserFilterByNAME;
import com.example.library_management.filter.user.impl.UserFilterByPhoneNo;

@Component
public class UserFilterStrategy {

	private final Map<UserFilterTypes, UserFilter> filterStrategy = new HashMap<>();

	public UserFilterStrategy(UserFilterByEmail userFilterByEmail, UserFilterByNAME filterByNAME,
			UserFilterByPhoneNo userFilterByPhoneNo) {
		filterStrategy.put(UserFilterTypes.NAME, userFilterByEmail);
		filterStrategy.put(UserFilterTypes.NAME, filterByNAME);
		filterStrategy.put(UserFilterTypes.PHONE_NO, userFilterByPhoneNo);
	}

	public UserFilter getUserFilter(UserFilterTypes userFilterType) {
		return filterStrategy.get(userFilterType);
	}
}
