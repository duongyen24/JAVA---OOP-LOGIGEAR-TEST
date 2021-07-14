package com.logigear.oop.animal;

public class Dove extends FlyableBird {
	
	public Dove() {
		this.name = "Dove";
		this.weight = 0.2f;
	}

	@Override
	public void sound() {
		System.out.println("ddd");
	}
	
	
	@Override
	public void fly() {
		if (super.canFly()) {
			System.out.println("Dove can fly");
		} else {
			System.out.println("Dove can't fly");
		}
	}

	@Override
	public void eat(AnimalFood animalFood) {
		if (animalFood instanceof Cereals) {
			this.weight += ((Cereals) animalFood).getWeight() * 0.01f;
		}
	}

	

}