package com.wipro.strategy;

import com.wipro.strategy.behaviour.Flyable;
import com.wipro.strategy.behaviour.Quakable;
import com.wipro.strategy.behaviour.impl.FlyNoWay;
import com.wipro.strategy.behaviour.impl.FlyWithWings;
import com.wipro.strategy.behaviour.impl.Quack;
import com.wipro.strategy.behaviour.impl.Squeak;
import com.wipro.strategy.species.MullardDuck;
import com.wipro.strategy.species.RedheadDuck;
import com.wipro.strategy.species.RubberDuck;

public class DuckUSimulator {
	public static void main(String[] args) {
		Flyable flyWithWings = new FlyWithWings();
		Flyable flyNoWay = new FlyNoWay();

		Quakable quack = new Quack();
		Quakable squeak = new Squeak();

		Duck mullardDuck = new MullardDuck(flyWithWings, squeak);
		Duck redheadDuck = new RedheadDuck(flyWithWings, quack);
		RubberDuck rubberDuck = new RubberDuck(flyNoWay, quack);

		showDucks(mullardDuck);
		showDucks(redheadDuck);
		showDucks(rubberDuck);
	}

	private static void showDucks(Duck duck) {
		duck.performQuack();
		duck.swim();
		duck.performFly();

		duck.display();
		System.out.println("---------------------");
	}

}
