package com.logigear.oop.animal;

public abstract class FlyableBird extends Bird {

	private float lostWeight = 0.01f;

	@Override
	public boolean canFly() {
		if (this.weight >= lostWeight) {
			this.weight -= lostWeight;
			return true;
		} else {
			return false;
		}
	}
}