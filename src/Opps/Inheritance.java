package Opps;

class Animal{
	void eat() {
		System.out.println("The animal eats food..");
	}
}

class Dog extends Animal{
	void bark() {
		System.out.println("The dog barks.");
	
	}
}
public class Inheritance {

	public static void main(String[] args) {
				Dog dog  = new Dog();
				dog.eat();
				dog.bark();
				
	}

}
