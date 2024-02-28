package com.wipro.bean.modes;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.wipro.bean.modes.service.ConcertLookup;
import com.wipro.bean.modes.service.impl.AbstractConcertLookup;

public class InstantiationModes {
	public static void main(String[] args) {
		ApplicationContext ctx = new AnnotationConfigApplicationContext(ModesConfiguration.class);
		Singer singer1 = ctx.getBean(Singer.class);
		Singer singer2 = ctx.getBean(Singer.class);
		var outcome = singer1 == singer2 ? "Both are Singleton" : "It's Prototype";
		System.out.println(outcome);
		
		System.out.println("---------------------------------");
		
		Concert concert1 = ctx.getBean(Concert.class);
		Concert concert2 = ctx.getBean(Concert.class);
		outcome = concert1.getSinger() == concert2.getSinger() ? "Both are Singleton" : "It's Prototype";
		System.out.println(outcome);
		
		System.out.println("---------------------------------");
		
		ConcertLookup concert3 = ctx.getBean(AbstractConcertLookup.class);
		ConcertLookup concert4 = ctx.getBean(AbstractConcertLookup.class);
		outcome = concert3.getMySinger() == concert4.getMySinger() ? "Both are Singleton" : "It's Prototype";
		System.out.println(outcome);

	}

}
