package com.wipro.app.profiles;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.GenericApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;

import com.wipro.app.profiles.model.Food;
import com.wipro.app.profiles.service.FoodProviderService;

public class Main {
	public static void main(String[] args) {
		GenericApplicationContext ctx = new AnnotationConfigApplicationContext(ProfilesConfigurer.class,
				ProfilesConfigurer2.class);
		
		ConfigurableEnvironment env = ctx.getEnvironment();
		env.setActiveProfiles("highschool");
		
		FoodProviderService foodProviderService = ctx.getBean(FoodProviderService.class);
		
		List<Food> lunchSet = foodProviderService.provideLunchSet();
		lunchSet.forEach(set -> System.out.println("Food: " + set.getName()));
		
		ctx.close();
	}

}
