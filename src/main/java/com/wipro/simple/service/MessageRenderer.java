package com.wipro.simple.service;

public interface MessageRenderer {
	void setMessageProvider(MessageProvider provider);

	MessageProvider getMessageProvider();

	void render();

}
