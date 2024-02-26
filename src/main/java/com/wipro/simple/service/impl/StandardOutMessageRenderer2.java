package com.wipro.simple.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.wipro.simple.service.MessageProvider;
import com.wipro.simple.service.MessageRenderer;

import lombok.Getter;
import lombok.Setter;

@Component("renderer")
public class StandardOutMessageRenderer2 implements MessageRenderer {
	@Getter
	@Setter
	private MessageProvider messageProvider;

	@Autowired
	public StandardOutMessageRenderer2(MessageProvider provider) {
		this.messageProvider = provider;
	}

	@Override
	public void render() {
		if (messageProvider == null) {
			throw new RuntimeException("You must set the property messageProvider of class: "
					+ StandardOutMessageRenderer2.class.getName());
		}
		System.out.println(messageProvider.getMessage());
	}

}
