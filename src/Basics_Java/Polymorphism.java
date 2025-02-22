package Basics_Java;

class Animal {
	void sound() {
		System.out.println("Animal makes a sound.");
	}
}

class Dog extends Animal{
	@Override
	void sound() {
		System.out.println("The dog barks..");
	}
}

public class Polymorphism {

	public static void main(String[] args) {
		
			Animal myAnimal = new Dog();
			myAnimal.sound();
		

	}

}
