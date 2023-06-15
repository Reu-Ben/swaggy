package com.swaggy.Swaggy.wallet.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/kafka")
public class KafkaController {

	@Autowired
	private KafkaTemplate<String, String> kafkaTemplate;

	@GetMapping("/{msg}")
	public void sendMessage(@PathVariable("msg") String msg) {
		kafkaTemplate.send("sfe", msg);
	}

	
}
