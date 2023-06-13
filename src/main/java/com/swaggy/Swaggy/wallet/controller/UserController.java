package com.swaggy.Swaggy.wallet.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.swaggy.Swaggy.wallet.request.CreateUserRequest;
import com.swaggy.Swaggy.wallet.request.UpdateUserRequest;
import com.swaggy.Swaggy.wallet.response.CustomResponse;
import com.swaggy.Swaggy.wallet.response.UserResponse;
import com.swaggy.Swaggy.wallet.service.UserService;

import io.swagger.v3.oas.annotations.Operation;

@RestController
@RequestMapping("/api/v1/users")
public class UserController {

	@Autowired
	private UserService userService;

	@Operation(description = "Create a new user", tags = "User Management")
	@PostMapping("/{accountType}")
	public ResponseEntity<UserResponse> create(@RequestBody CreateUserRequest request,
			@PathVariable("accountType") String accountType) {
		return ResponseEntity.status(HttpStatus.OK).body(userService.create(request, accountType));
	}

	@Operation(description = "Update existing user", tags = "User Management")
	@PutMapping
	public ResponseEntity<UserResponse> update(@RequestBody UpdateUserRequest request) {
		return ResponseEntity.status(HttpStatus.OK).body(userService.update(request));
	}

	@Operation(description = "Find all users", tags = "User Management")
	@GetMapping
	public ResponseEntity<List<UserResponse>> findAll() {
		return ResponseEntity.status(HttpStatus.OK).body(userService.findAllUsers());
	}

	@Operation(description = "Find user by ID", tags = "User Management")
	@GetMapping("/{id}")
	public ResponseEntity<UserResponse> findById(@PathVariable("id") Long id) {
		return ResponseEntity.status(HttpStatus.OK).body(userService.findById(id));
	}

	@Operation(description = "Delete user by ID", tags = "User Management")
	@DeleteMapping("/{id}")
	public ResponseEntity<?> delete(@PathVariable("id") Long id) {
		userService.delete(id);
		return ResponseEntity.status(HttpStatus.OK).body(CustomResponse.build("status", true));
	}
}
