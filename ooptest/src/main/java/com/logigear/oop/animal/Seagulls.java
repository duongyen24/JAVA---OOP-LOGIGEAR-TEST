package com.logigear.oop.animal;

public class Seagulls extends FlyableBird {

	public Seagulls() {
		this.name = "Seagulls";
		this.weight = 0.2f;
	}
	
	@Override
	public void sound() {
		System.out.println("rrr");
	}


	@Override
	public void eat(AnimalFood animalFood) {
		if (animalFood instanceof Fish) {
			this.weight += ((Fish) animalFood).getWeight() * 0.03f;
		}
	}

	
	@Override
	public void fly() {
		if (super.canFly()) {
			System.out.println("Seagulls can fly");
		} else {
			System.out.println("Seagulls can't fly");
		}
	}
}
