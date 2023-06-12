package com.swaggy.Swaggy.wallet.request;

import lombok.Data;

@Data
public class UpdateUserRequest implements IUserRequest {

	private Long id;

	private String email;

	private String nickname;

	private String password;

	private String address;

	private String name;

	private String surname;

	private String dob;
}
