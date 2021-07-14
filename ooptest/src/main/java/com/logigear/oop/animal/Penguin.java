package com.logigear.oop.animal;

public class Penguin extends UnflyableBird {
	public Penguin() {
		this.name = "Penguin";
		this.weight = 0.2f;
	}

	@Override
	public void sound() {
		System.out.println("www");
	}
	
	@Override
	public void fly() {
		if (super.canFly()) {
			System.out.println("Penguin can fly");
		} else {
			System.out.println("Penguin can't fly");
		}
	}

	@Override
	public void eat(AnimalFood animalFood) {
		if (animalFood instanceof Fish) {
			this.weight += ((Fish) animalFood).getWeight() * 0.03f;
		}
	}

	

}