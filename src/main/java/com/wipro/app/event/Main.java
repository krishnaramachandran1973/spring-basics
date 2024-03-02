package com.wipro.app.event;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.GenericApplicationContext;

public class Main {
	public static void main(String[] args) {
		GenericApplicationContext ctx = new AnnotationConfigApplicationContext(MessageEventConfigurer.class);

		Publisher pub = ctx.getBean(Publisher.class);
		pub.publish("I send an SOS to the world... ");
		pub.publish("... I hope that someone gets my...");
		pub.publish("... Message in a bottle");
	}
}
