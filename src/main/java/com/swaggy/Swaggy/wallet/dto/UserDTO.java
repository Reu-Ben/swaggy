package com.swaggy.Swaggy.wallet.dto;

import com.swaggy.Swaggy.wallet.domain.dto.AbstractDTO;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = false)
public class UserDTO extends AbstractDTO {

	private static final long serialVersionUID = 1L;

	private Long id;

	private String email;

	private String nickname;

	private String password;

	private String address;

	private String name;

	private String surname;

	private String dob;

	private BlockchainAccountDTO account;

}
