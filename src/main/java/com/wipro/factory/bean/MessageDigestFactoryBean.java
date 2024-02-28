package com.wipro.factory.bean;

import java.security.MessageDigest;

import org.springframework.beans.factory.FactoryBean;
import org.springframework.beans.factory.InitializingBean;

import lombok.Setter;

public class MessageDigestFactoryBean implements FactoryBean<MessageDigest>, InitializingBean {

	@Setter
	private String algorithmName = "MD5";
	private MessageDigest messageDigest = null;

	@Override
	public void afterPropertiesSet() throws Exception {
		messageDigest = MessageDigest.getInstance(algorithmName);
	}

	@Override
	public MessageDigest getObject() throws Exception {
		return this.messageDigest;
	}

	@Override
	public Class<?> getObjectType() {
		return MessageDigest.class;
	}

}
