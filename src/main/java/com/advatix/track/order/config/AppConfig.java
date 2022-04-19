package com.advatix.track.order.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;

@Configuration
public class AppConfig {
	
	@Bean
	public ObjectMapper getMapper() {
	   ObjectMapper mapper = new ObjectMapper();
	   mapper.configure(DeserializationFeature.FAIL_ON_IGNORED_PROPERTIES, false);
	   return mapper;
	}

}
