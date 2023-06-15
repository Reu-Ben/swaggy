package com.swaggy.Swaggy.wallet.configuration.kafka.producer;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class TopicConfiguration {

	@Bean
	public NewTopic topic() {
		return TopicBuilder.name("sfe").build();
	}
}
