package com.swaggy.Swaggy.wallet.response;

import com.swaggy.Swaggy.wallet.dto.UserDTO;

import lombok.Data;

@Data
public class UserResponse {

	private String name;

	private String surname;

	private String address;

	private String dob;

	private String accountAddress;

	public UserResponse(UserDTO user) {

		name = user.getName();
		surname = user.getSurname();
		address = user.getAddress();
		dob = user.getDob();
		accountAddress = user.getAccount().getUId();
	}

}
