package com.swaggy.Swaggy.wallet.request;

import lombok.Data;

@Data
public class CurrencyExchangeRequest {

	private String from;

	private String to;

	private Double amount;

}
