package com.wipro.factory.bean;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FactoryBeanConfigurer {

	@Bean
	public MessageDigestFactoryBean shaDigest() {
		MessageDigestFactoryBean messageDigestFactoryBean = new MessageDigestFactoryBean();
		messageDigestFactoryBean.setAlgorithmName("SHA1");
		return messageDigestFactoryBean;
	}

	@Bean
	public MessageDigestFactoryBean defaultDigest() {
		MessageDigestFactoryBean messageDigestFactoryBean = new MessageDigestFactoryBean();
		return messageDigestFactoryBean;
	}

	@Bean
	public MessageDigester digester() throws Exception {
		MessageDigester messageDigester = new MessageDigester();
		messageDigester.setDigest1(shaDigest().getObject());
		messageDigester.setDigest2(defaultDigest().getObject());
		return messageDigester;
	}

}
