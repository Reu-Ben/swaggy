package com.swaggy.Swaggy.wallet.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.swaggy.Swaggy.wallet.request.CurrencyExchangeRequest;
import com.swaggy.Swaggy.wallet.response.ExchangeResponse;
import com.swaggy.Swaggy.wallet.service.ExchangeRateService;

import io.swagger.v3.oas.annotations.Operation;

@RestController
@RequestMapping("/api/v1/rates")
public class RateExchangeController {

	@Autowired
	private ExchangeRateService exchangeRateService;

	@Operation(description = "This Api returns currency exchange data in real time", tags = "Forex Exchange")
	@PostMapping
	public ResponseEntity<ExchangeResponse> getRate(@RequestBody CurrencyExchangeRequest request) {
		ExchangeResponse response = exchangeRateService.getExchange(request.getFrom(), request.getTo(),
				request.getAmmount());

		return ResponseEntity.status(HttpStatus.OK).body(response);
	}

}
