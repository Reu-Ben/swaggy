package com.swaggy.Swaggy.wallet.controller;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.swaggy.Swaggy.wallet.request.CurrencyExchangeRequest;
import com.swaggy.Swaggy.wallet.response.ExchangeResponse;
import com.swaggy.Swaggy.wallet.service.ExchangeRateService;

@RestController
@RequestMapping("/api/v1/rates")
public class RateExchangeController {

	@Autowired
	private ExchangeRateService exchangeRateService;

	@GetMapping("")
	public ResponseEntity<?> getRate(@RequestBody CurrencyExchangeRequest request)
			throws IOException, InterruptedException {
		ExchangeResponse response = exchangeRateService.getExchange(request.getFrom(), request.getTo(),
				request.getAmmount());

		return ResponseEntity.status(HttpStatus.OK).body(response);
	}

}
