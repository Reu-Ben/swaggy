package com.swaggy.Swaggy.wallet.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

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
		ResponseEntity<String> response = restTemplate.exchange(exchangeUrl, HttpMethod.GET, httpEntity, String.class);
		return new ExchangeResponse(response.getBody());
	}

}
