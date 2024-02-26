package com.wipro.simple.service.impl;

import com.wipro.simple.service.MessageProvider;

public class HelloWorldMessageProvider implements MessageProvider {
	
	@Override
	public String getMessage() {
		return "Hello World!";
	}

}
