package com.java.superkeyword;

class Animal {
	Animal() {
		System.out.println("animal is eating");
	}
}

class Dog extends Animal {
	Dog() {
		super(); // super() is used to invoke parent class constructor i.e here Animal()
		System.out.println("dog is barking");
	}
}

class Super {
	public static void main(String args[]) {
		Dog d = new Dog();
	}
}