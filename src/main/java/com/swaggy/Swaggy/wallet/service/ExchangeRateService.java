package com.swaggy.Swaggy.wallet.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.swaggy.Swaggy.wallet.domain.exceptions.GenericValidationException;
import com.swaggy.Swaggy.wallet.request.CurrencyExchangeRequest;
import com.swaggy.Swaggy.wallet.response.ExchangeResponse;

@Service
public class ExchangeRateService {

	@Autowired
	private RestTemplate restTemplate;

	@Autowired
	private HttpEntity<String> httpEntity;

	public ExchangeResponse getExchange(String from, String to, double ammount) {

		final String exchangeUrl = "https://currency-exchange.p.rapidapi.com/exchange?from=" + from + "&to=" + to
				+ "&q=" + ammount;

		try {
			ResponseEntity<String> response = restTemplate.exchange(exchangeUrl, HttpMethod.GET, httpEntity,
					String.class);
			return new ExchangeResponse(response.getBody());
		} catch (Exception e) {
			throw new GenericValidationException("Server Error");
		}

	}

	public void validateCurrencyExchangeRequest(CurrencyExchangeRequest request) {
		if (request.getAmount() == null) {
			throw new GenericValidationException("Ammount must not be null");
		}

		if (request.getFrom() == null || request.getFrom().isBlank()) {
			throw new GenericValidationException("Specify from currecy");
		}

		if (request.getTo() == null || request.getTo().isBlank()) {
			throw new GenericValidationException("Specify To currecy");
		}

	}

}
