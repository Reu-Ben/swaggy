package com.swaggy.Swaggy.wallet.controller;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class ConsumerKafkaMessages {

	@KafkaListener(topics = "sfe", groupId = "S_F_E")
	public void listenGroupFoo(String message) {
		System.out.println("Received Message in SFE " + message);
	}
}
