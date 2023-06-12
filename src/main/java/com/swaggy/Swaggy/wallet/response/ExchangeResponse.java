package com.swaggy.Swaggy.wallet.response;

import lombok.Data;

@Data
public class ExchangeResponse {

	private String ammout;

	public ExchangeResponse(String ammount) {
		this.ammout = ammount;
	}
}
