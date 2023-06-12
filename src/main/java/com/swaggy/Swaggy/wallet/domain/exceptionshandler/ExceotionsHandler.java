package com.swaggy.Swaggy.wallet.domain.exceptionshandler;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.client.HttpServerErrorException;

import com.swaggy.Swaggy.wallet.domain.exceptions.GenericValidationException;
import com.swaggy.Swaggy.wallet.domain.exceptions.ResourceNotFoundException;

@RestControllerAdvice
public class ExceotionsHandler {

	@ExceptionHandler(ResourceNotFoundException.class)
	public ResponseEntity<?> handleResourceNotFoundException(ResourceNotFoundException exception) {
		Map<String, String> response = new HashMap<>();
		response.put("message", exception.getMessage());
		return ResponseEntity.status(HttpStatus.NOT_FOUND).body(response);
	}

	@ExceptionHandler(GenericValidationException.class)
	public ResponseEntity<?> handleGenericValidationException(GenericValidationException exception) {
		Map<String, String> response = new HashMap<>();
		response.put("message", exception.getMessage());
		return ResponseEntity.status(HttpStatus.NOT_FOUND).body(response);
	}

	@ExceptionHandler(HttpServerErrorException.class)
	public ResponseEntity<?> handleHttpServerErrorException(HttpServerErrorException exception) {
		Map<String, String> response = new HashMap<>();
		response.put("message", exception.getMessage());
		return ResponseEntity.status(HttpStatus.NOT_FOUND).body(response);
	}

}
