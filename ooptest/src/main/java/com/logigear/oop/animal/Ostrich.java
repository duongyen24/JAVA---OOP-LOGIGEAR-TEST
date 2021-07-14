package com.logigear.oop.animal;

public class Ostrich extends UnflyableBird {
	public Ostrich() {
		this.name = "Ostrich";
		this.weight = 0.2f;
	}

	@Override
	public void sound() {
		System.out.println("sss");
	}
	
	@Override
	public void fly() {
		if (super.canFly()) {
			System.out.println("Ostrich can fly");
		} else {
			System.out.println("Ostrich can't fly");
		}
	}

	@Override
	public void eat(AnimalFood animalFood) {
		if (animalFood instanceof Cereals) {
			this.weight += ((Cereals) animalFood).getWeight() * 0.01f;
		}
	}

	

}