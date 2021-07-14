package com.logigear.oop.animal;

public class Fish extends Animal implements AnimalFood {
	public Fish() {
		this.name = "Fish";
		this.weight = 0.1f;
	}

	@Override
	public void sound() {
		System.out.println("nnn");
	}
	
	public Fish(float weight) {
		this.weight = weight;
	}

	@Override
	public void eat(AnimalFood animalFood) {

	}

	
}