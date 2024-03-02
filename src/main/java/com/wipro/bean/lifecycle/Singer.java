package com.wipro.bean.lifecycle;

import org.springframework.beans.factory.BeanCreationException;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.GenericApplicationContext;

import lombok.Setter;
import lombok.ToString;

@ToString
public class Singer implements InitializingBean, DisposableBean {
	private static final String DEFAULT_NAME = "Eric Clapton";
	@Setter
	private String name;
	@Setter
	private int age = Integer.MIN_VALUE;

	public static void main(String[] args) {
		GenericApplicationContext ctx = new AnnotationConfigApplicationContext(LifeCycleConfiguration.class);
		getBean("singerOne", ctx);
		getBean("singerTwo", ctx);
		getBean("singerThree", ctx);
		ctx.close();
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("Initializing bean");
		if (name == null) {
			System.out.println("Using  default  name");
			name = DEFAULT_NAME;
		}

		if (age == Integer.MIN_VALUE) {
			throw new IllegalArgumentException("You must set the age property of any beans of type " + Singer.class);
		}

	}
	
	@Override
	public void destroy() throws Exception {
		System.out.println("Destroy called");	
	}

	private static Singer getBean(String beanName, ApplicationContext ctx) {
		try {
			Singer bean = (Singer) ctx.getBean(beanName);
			System.out.println(bean);
			return bean;
		} catch (BeanCreationException ex) {
			System.out.println("An error occured in bean configuration: " + ex.getMessage());
			return null;
		}
	}

	

}
