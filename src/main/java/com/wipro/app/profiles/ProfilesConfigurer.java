package com.wipro.app.profiles;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.wipro.app.profiles.service.FoodProviderService;
import com.wipro.app.profiles.service.highschool.FoodProviderServiceImpl;

@Configuration
@Profile("highschool")
public class ProfilesConfigurer {

	@Bean
	public FoodProviderService foodProviderHighSchool() {
		return new FoodProviderServiceImpl();
	}
}
