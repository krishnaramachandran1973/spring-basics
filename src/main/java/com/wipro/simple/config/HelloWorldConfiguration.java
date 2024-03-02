package com.wipro.simple.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import com.wipro.simple.service.MessageProvider;
import com.wipro.simple.service.MessageRenderer;
import com.wipro.simple.service.impl.HelloWorldMessageProvider;
import com.wipro.simple.service.impl.StandardOutMessageRenderer;

@Configuration
public class HelloWorldConfiguration {

	// <bean id="provider" />
	@Bean
	public MessageProvider provider() {
		return new HelloWorldMessageProvider();
	}

	@Bean
	public MessageRenderer renderer() {
		MessageRenderer renderer = new StandardOutMessageRenderer();
		renderer.setMessageProvider(provider());
		return renderer;
	}
}
