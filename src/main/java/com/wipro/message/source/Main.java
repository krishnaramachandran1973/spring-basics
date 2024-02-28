package com.wipro.message.source;

import java.util.Locale;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.GenericApplicationContext;

public class Main {
	public static void main(String[] args) {
		GenericApplicationContext ctx = new AnnotationConfigApplicationContext(MessageSourceConfiguration.class);

		Locale english = Locale.ENGLISH;
		Locale german = new Locale("de", "DE");

		System.out.println(ctx.getMessage("msg", null, english));
		System.out.println(ctx.getMessage("msg", null, german));

		System.out.println(ctx.getMessage("nameMsg", new Object[] { "John", "Mayer" }, english));
		System.out.println(ctx.getMessage("nameMsg", new Object[] { "John", "Mayer" }, german));

		ctx.close();
	}
}
