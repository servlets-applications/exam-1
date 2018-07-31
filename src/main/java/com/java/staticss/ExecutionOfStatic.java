//2. Execution of static block and non static block. When does a constructor , static block and non static block execute and how many times.
package com.java.staticss;

public class ExecutionOfStatic {
	static {
		System.out.println("static block1");
	}
	static {
		System.out.println("static block2");
	}

	public static void main(String[] args) {
		System.out.println("main method ");
		ExecutionOfStatic e1 = new ExecutionOfStatic();
		ExecutionOfStatic e2 = new ExecutionOfStatic();
	}

	static {
		System.out.println("static block3");
	}
}

//ans:-First static block executes,then main method executes.Here static block executes3 times.in a programme constructor executes only once.