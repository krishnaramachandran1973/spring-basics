package com.wipro.app.profiles;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.wipro.app.profiles.service.FoodProviderService;
import com.wipro.app.profiles.service.kindergarten.FoodProviderServiceImpl;

@Configuration
@Profile("kindergarten")
public class ProfilesConfigurer2 {

	@Bean
	public FoodProviderService foodProviderHighSchool() {
		return new FoodProviderServiceImpl();
	}

	/*
	 * @Bean
	 * 
	 * @Profile("kindergarten") public FoodProviderService
	 * foodProviderKindergarten() { return new
	 * com.wipro.app.profiles.service.kindergarten.FoodProviderServiceImpl(); }
	 */
}
