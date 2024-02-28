package com.wipro.factory.bean;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.GenericApplicationContext;

public class Main {
	public static void main(String[] args) {
		GenericApplicationContext ctx = new AnnotationConfigApplicationContext(FactoryBeanConfigurer.class);
		MessageDigester digester = (MessageDigester) ctx.getBean("digester");
		digester.digest("Hello World!");
		ctx.close();

	}

}
