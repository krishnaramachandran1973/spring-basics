package com.wipro.strategy;

import com.wipro.strategy.behaviour.Flyable;
import com.wipro.strategy.behaviour.Quakable;

// is a
// has a 
public abstract class Duck {
	protected Flyable flyable;
	protected Quakable quakable;

	public void swim() {
		System.out.println("Swimming");
	}

	public void performFly() {
		this.flyable.fly();
	}

	public void performQuack() {
		this.quakable.quack();
	}

	public abstract void display();

}
