package com.wipro.app.event;

import org.springframework.context.ApplicationEvent;

import lombok.Getter;

@Getter
public class MessageEvent extends ApplicationEvent {
	private String message;

	public MessageEvent(Object source, String msg) {
		super(source);
		this.message = msg;
	}
}
