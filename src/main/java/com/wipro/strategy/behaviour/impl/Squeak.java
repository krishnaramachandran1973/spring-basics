package com.wipro.strategy.behaviour.impl;

import com.wipro.strategy.behaviour.Quakable;

public class Squeak implements Quakable {

	@Override
	public void quack() {
		System.out.println("Squeak squeak");

	}

}
