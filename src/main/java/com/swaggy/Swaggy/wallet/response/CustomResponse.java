package com.swaggy.Swaggy.wallet.response;

import java.util.HashMap;
import java.util.Map;

import lombok.Data;

@Data
public class CustomResponse {

	private static Map<Object, Object> response = new HashMap<>();

	public static Map<Object, Object> build(Object key, Object value) {
		response.put(key, value);
		return response;
	}

}
