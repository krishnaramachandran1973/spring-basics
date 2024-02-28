package com.wipro.app.profiles.service.kindergarten;

import java.util.Arrays;
import java.util.List;

import com.wipro.app.profiles.model.Food;
import com.wipro.app.profiles.service.FoodProviderService;

public class FoodProviderServiceImpl implements FoodProviderService {

	@Override
	public List<Food> provideLunchSet() {
		return Arrays.asList(new Food("Milk"), new Food("Biscuits"));
	}

}
