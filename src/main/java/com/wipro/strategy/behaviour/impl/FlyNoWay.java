package com.wipro.strategy.behaviour.impl;

import com.wipro.strategy.behaviour.Flyable;

public class FlyNoWay implements Flyable{

	@Override
	public void fly() {
		System.out.println("Fly no way...");
		
	}

}
