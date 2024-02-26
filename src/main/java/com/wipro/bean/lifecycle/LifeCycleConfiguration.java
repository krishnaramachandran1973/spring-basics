package com.wipro.bean.lifecycle;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;

@Configuration
@Lazy
public class LifeCycleConfiguration {

	@Bean
	public Singer singerOne() {
		Singer singer = new Singer();
		singer.setName("John Mayer");
		singer.setAge(30);
		return singer;
	}

	@Bean
	public Singer singerTwo() {
		Singer singer = new Singer();
		singer.setAge(72);
		return singer;
	}

	@Bean
	public Singer singerThree() {
		Singer singer = new Singer();
		singer.setName("John Butler");
		return singer;
	}

}
