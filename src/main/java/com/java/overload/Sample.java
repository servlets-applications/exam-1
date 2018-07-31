//method hiding
package com.java.overload;

class MethodHiding {

	public static void hidingMethod() {
		System.out.println("method of super class");
	}
}

public class Sample extends MethodHiding {
	public static void hidingMethod() {
		System.out.println("method of sub class");
	}

	public static void main(String args[]) {
		Sample.hidingMethod();
	}
}
/*
 * when superclass and subclass contain the same method including parameters and
 * if they are static. The method in the superclass will be hidden by the one
 * that is in the subclass. This mechanism is known as method hiding.
 */