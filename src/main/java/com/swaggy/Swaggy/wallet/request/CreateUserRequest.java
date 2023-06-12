package com.swaggy.Swaggy.wallet.request;

import lombok.Data;

@Data
public class CreateUserRequest implements IUserRequest {

	private String email;

	private String nickname;

	private String password;

	private String address;

	private String name;

	private String surname;

	private String dob;
}
