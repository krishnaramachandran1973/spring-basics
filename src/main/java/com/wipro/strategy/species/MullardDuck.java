package com.wipro.strategy.species;

import com.wipro.strategy.Duck;
import com.wipro.strategy.behaviour.Flyable;
import com.wipro.strategy.behaviour.Quakable;

public class MullardDuck extends Duck {

	public MullardDuck(Flyable flyable, Quakable quakable) {
		this.flyable = flyable;
		this.quakable = quakable;
	}

	@Override
	public void display() {
		System.out.println("Mullard duck is displayed");

	}

}
