package com.wipro.simple.service.impl;

import org.springframework.stereotype.Service;

import com.wipro.simple.service.MessageProvider;


// StereoType
@Service("provider")
public class HelloWorldMessageProvider2 implements MessageProvider {
	@Override
	public String getMessage() {
		return "Hello World!";
	}
}
