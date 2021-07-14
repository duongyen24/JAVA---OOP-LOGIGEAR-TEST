package com.logigear.oop;

import com.logigear.oop.animal.Bird;
import com.logigear.oop.animal.Cereals;
import com.logigear.oop.animal.Fish;
import com.logigear.oop.animal.Penguin;
import com.logigear.oop.animal.Seagulls;


public class MyApp {

	public static void main(String[] args) {
		
		//question1
//		int[] inputNumber = { 1 ,3, 4, 5, 6, 3 };
//		Question1.oddNumber(inputNumber);
		
//		Encapsulation
//		Abstraction
//		Inheritance
//		Polymorphism
//
//
//		Inheritance
//		class Animal {
//			void eat() {
//				System.out.println("eating...");
//			}
//		}
//		class Dog extends Animal {
//			void bark() {
//				System.out.println("barking...");
//			}
//		}
//		class TestInheritance {
//			public static void main(String args[]) {
//				Dog d = new Dog();
//				d.bark();
//				d.eat();
//			}
//		} 
		
		//question2
		
		Fish fish1 = new Fish(100f); 
		Cereals cereals1 = new Cereals(90f); 
		Bird bird1 = new Penguin();
		Bird bird2 = new Seagulls();
		bird1.sound();
		bird2.sound();
		printDash();
		bird1.fly();
		bird2.fly();
		printDash();
		System.out.println(bird1.getWeight());
		System.out.println(bird2.getWeight());
		bird1.eat(fish1);
		bird2.eat(cereals1);
		printDash();
		System.out.println(bird1.getWeight());
		System.out.println(bird2.getWeight());

		//question3
		
		//json 
		
//		String dataPath = Utility.readFromFile("\\src\\test\\java\\files\\humandata.json");		
//		Gson gson = new GsonBuilder().setPrettyPrinting().create();
//		String human = Utility.readFromFile(dataPath);
//		Human human1 = gson.fromJson(human,Human.class);
//		System.out.println(human1.toString());
	
	}

	private static void printDash() {
		System.out.println("--------------");
		
	}
	

}

