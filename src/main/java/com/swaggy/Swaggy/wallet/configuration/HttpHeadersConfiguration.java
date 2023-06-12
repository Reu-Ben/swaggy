package com.swaggy.Swaggy.wallet.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;

@Configuration
public class HttpHeadersConfiguration {

	@Bean
	public HttpEntity<String> getRequestEntity() {
		HttpHeaders headers = new HttpHeaders();
		headers.add("Content-Type", "application/json");
		headers.add("Accept", "*/*");
		headers.add("X-RapidAPI-Key", "e19ce760bemshaa28c69a814c2bap165c2fjsn05245beb8cce");
		headers.add("X-RapidAPI-Host", "currency-exchange.p.rapidapi.com");
		HttpEntity<String> requestEntity = new HttpEntity<>(headers);
		return requestEntity;
	}
}
