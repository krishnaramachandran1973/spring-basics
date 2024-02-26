package com.wipro.simple.service.impl;

import com.wipro.simple.service.MessageProvider;
import com.wipro.simple.service.MessageRenderer;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class StandardOutMessageRenderer implements MessageRenderer {
	
	private MessageProvider messageProvider;

	@Override
	public void render() {
		if (messageProvider == null) {
			throw new RuntimeException("You must set the property messageProvider of class: "
					+ StandardOutMessageRenderer.class.getName());
		}
		System.out.println(messageProvider.getMessage());
	}

}
