package com.java.staticvariable;
//Static method
public class StaticMethod {

	static int cube(int a) {
		return a * a * a;
	}

	public static void main(String args[]) {
		int result = StaticMethod.cube(3);
		System.out.println(result);
	}
}

/*
 * a Method in which a static keyword is used is known as static variable. When
 * a method is declared as static, it can be accessed before any objects of its
 * class are created, and without reference to any object. The static method can
 * not use non static data member or call non-static method directly.
 */
