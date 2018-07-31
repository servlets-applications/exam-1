//super(parameters)
package com.java.superkeyword;

class Person {
	int id;
	String name;

	Person(int id, String name) {
		this.id = id;
		this.name = name;
	}
}

class Emp extends Person {
	float salary;

	Emp(int id, String name, float salary) {
		super(id, name);//super(id,name) is used here because it reuses parent class constructor i.e Person().
		this.salary = salary;
	}

	void display() {
		System.out.println(id + " " + name + " " + salary);
	}
}

class Super1 {
	public static void main(String[] args) {
		Emp e1 = new Emp(1, "Subhatoshh", 45000f);
		e1.display();
	}
}
