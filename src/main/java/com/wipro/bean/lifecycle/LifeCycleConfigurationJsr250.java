package com.wipro.bean.lifecycle;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;

@Configuration
@Lazy
public class LifeCycleConfigurationJsr250 {

	@Bean
	public SingerWithJsr250 singerOne() {
		SingerWithJsr250 singer = new SingerWithJsr250();
		singer.setName("John Mayer");
		singer.setAge(30);
		return singer;
	}

	@Bean
	public SingerWithJsr250 singerTwo() {
		SingerWithJsr250 singer = new SingerWithJsr250();
		singer.setAge(72);
		return singer;
	}

	@Bean
	public SingerWithJsr250 singerThree() {
		SingerWithJsr250 singer = new SingerWithJsr250();
		singer.setName("John Butler");
		return singer;
	}

}
