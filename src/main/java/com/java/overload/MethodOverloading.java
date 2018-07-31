//5. Method overloading code.
package com.java.overload;

class Overloading {
	static int add(int a, int b) {
		return a + b;
	}

	static int add(int a, int b, int c) {
		return a + b + c;
	}
}

public class MethodOverloading {
	public static void main(String[] args) {
		System.out.println(Overloading.add(11, 10));
		System.out.println(Overloading.add(10, 40, 50));

	}
}//method overloading occours in two ways ,by changing the number of arguments and another is by changing the datatype.