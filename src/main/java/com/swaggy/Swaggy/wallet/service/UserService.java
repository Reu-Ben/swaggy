package com.swaggy.Swaggy.wallet.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.swaggy.Swaggy.wallet.domain.service.GenericService;
import com.swaggy.Swaggy.wallet.dto.BlockchainAccountDTO;
import com.swaggy.Swaggy.wallet.dto.UserDTO;
import com.swaggy.Swaggy.wallet.model.User;
import com.swaggy.Swaggy.wallet.request.CreateUserRequest;
import com.swaggy.Swaggy.wallet.request.IUserRequest;
import com.swaggy.Swaggy.wallet.request.UpdateUserRequest;
import com.swaggy.Swaggy.wallet.response.UserResponse;

@Service
public class UserService extends GenericService<User, UserDTO> {

	@Autowired
	private BlockchainAccountService blockchainService;

	public UserResponse create(CreateUserRequest request, String accountType) {
		UserDTO user = new UserDTO();
		_setUserDetails(request, user);
		BlockchainAccountDTO account = blockchainService.createAccount(accountType);
		user.setAccount(account);
		return new UserResponse(super.create(user));
	}

	public UserResponse findById(Long id) {
		return new UserResponse(super.read(id));
	}

	public List<UserResponse> findAllUsers() {
		return super.findAll().stream().map(user -> new UserResponse(user)).collect(Collectors.toList());
	}

	public UserResponse update(UpdateUserRequest request) {
		UserDTO user = super.read(request.getId());
		_setUserDetails(request, user);
		return new UserResponse(super.update(user));
	}

	public void delete(Long userId) {
		super.delete(super.read(userId));
	}

	private UserDTO _setUserDetails(IUserRequest request, UserDTO user) {
		user.setAddress(request.getAddress());
		user.setDob(request.getDob());
		user.setEmail(request.getEmail());
		user.setSurname(request.getSurname());
		user.setName(request.getName());
		user.setPassword(request.getPassword());
		user.setNickname(request.getNickname());
		return user;
	}

}