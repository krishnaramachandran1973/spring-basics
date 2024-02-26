package com.wipro.bean.lifecycle;

import org.springframework.beans.factory.BeanCreationException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.GenericApplicationContext;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

public class SingerWithJsr250 {
	private static final String DEFAULT_NAME = "Eric Clapton";
	private String name;
	private int age = Integer.MIN_VALUE;

	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@PostConstruct
	public void init() throws Exception {
		System.out.println("Initializing bean");
		if (name == null) {
			System.out.println("Using  default  name");
			name = DEFAULT_NAME;
		}

		if (age == Integer.MIN_VALUE) {
			throw new IllegalArgumentException(
					"You must set the age property of any beans of type " + SingerWithJsr250.class);
		}
	}
	
	@PreDestroy
	public void destroy() throws Exception {
		System.out.println("Destroy called");	
	}

	public String toString() {
		return "\tName: " + name + "\n\tAge: " + age;
	}

	public static void main(String... args) {
		GenericApplicationContext ctx = new AnnotationConfigApplicationContext(LifeCycleConfigurationJsr250.class);
		getBean("singerOne", ctx);
		getBean("singerTwo", ctx);
		getBean("singerThree", ctx);
		ctx.close();
	}

	private static SingerWithJsr250 getBean(String beanName, ApplicationContext ctx) {
		try {
			SingerWithJsr250 bean = (SingerWithJsr250) ctx.getBean(beanName);
			System.out.println(bean);
			return bean;
		} catch (BeanCreationException ex) {
			System.out.println("An error occured in bean configuration: " + ex.getMessage());
			return null;
		}
	}

}