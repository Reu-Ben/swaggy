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

	private String accountType;

	public UserResponse(UserDTO user) {

		name = user.getName();
		surname = user.getSurname();
		address = user.getAddress();
		dob = user.getDob();
		if (user.getAccount() != null) {
			accountAddress = user.getAccount().getWalletAddress();
			accountType = user.getAccount().getWalletType();
		}
	}

}
