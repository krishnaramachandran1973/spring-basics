package com.wipro.simple;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

import com.wipro.simple.config.HelloWorldConfiguration;
import com.wipro.simple.config.HelloWorldConfiguration2;
import com.wipro.simple.service.MessageProvider;
import com.wipro.simple.service.MessageRenderer;
import com.wipro.simple.service.impl.HelloWorldMessageProvider;
import com.wipro.simple.service.impl.StandardOutMessageRenderer;

public class HelloWorld {
	public static void main(String[] args) {
		// IOC
		MessageRenderer mr = new StandardOutMessageRenderer();
		MessageProvider pr = new HelloWorldMessageProvider();
		mr.setMessageProvider(pr);
		mr.render();

		System.out.println("-------------------------------");

		DefaultListableBeanFactory factory = new DefaultListableBeanFactory();
		XmlBeanDefinitionReader bdr = new XmlBeanDefinitionReader(factory);
		bdr.loadBeanDefinitions(new ClassPathResource("app-context.xml"));
		MessageRenderer renderer4 = factory.getBean("renderer", StandardOutMessageRenderer.class);
		renderer4.render();

		System.out.println("-------------------------------");

		ApplicationContext context = new ClassPathXmlApplicationContext("app-context.xml");
		MessageRenderer renderer = context.getBean("renderer", MessageRenderer.class);
		renderer.render();

		System.out.println("-------------------------------");

		ApplicationContext annotationContext = new AnnotationConfigApplicationContext(HelloWorldConfiguration.class);
		MessageRenderer renderer2 = annotationContext.getBean("renderer", MessageRenderer.class);
		renderer2.render();

		System.out.println("-------------------------------");

		ApplicationContext annotationContext2 = new AnnotationConfigApplicationContext(HelloWorldConfiguration2.class);
		MessageRenderer renderer3 = annotationContext2.getBean("renderer", MessageRenderer.class);
		renderer3.render();
	}

}
