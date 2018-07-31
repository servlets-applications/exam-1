package com.java.staticss;

public class ExecutionOfNonStatic {

	{
		System.out.println("non-static-block-1");
	}

	public static void main(String[] args) {
		System.out.println("main method ");
		ExecutionOfNonStatic en = new ExecutionOfNonStatic();

	}

	{
		System.out.println("non-static-block-2");
	}

}/*In case of Non-static methods ,main method executes first and only once.then non-static block executes.Here Non-Static block executes 2 times.*/