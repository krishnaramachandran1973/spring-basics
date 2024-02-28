package com.wipro.app.event;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@Component
public class MessageEventListener implements ApplicationListener<MessageEvent> {

	@Override
	public void onApplicationEvent(MessageEvent event) {
		System.out.println("Received: " + event.getMessage());
	}

}
