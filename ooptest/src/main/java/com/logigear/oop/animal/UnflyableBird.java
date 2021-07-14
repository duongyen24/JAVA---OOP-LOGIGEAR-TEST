package com.logigear.oop.animal;

public abstract class UnflyableBird extends Bird {
	@Override
	public boolean canFly() {
		return false;
	}
}
