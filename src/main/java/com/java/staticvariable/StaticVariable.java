//Use of static variable 
package com.java.staticvariable;

public class StaticVariable {
	
		  static int age;//static variable
		  static String name;//static variable
		 
		  //  Static Method
		  static void show(){
		      System.out.println("Age is: "+age);
		      System.out.println("Name is: "+name);
		  }
		  // static method
		  public static void main(String args[]) 
		  {
			  age = 24;
			  name = "Debi";
		      show();
		  }
		}

/*a variable in which a static keyword is used is known as static variable.
 * When a variable/method is declared as static, it can be accessed before any objects of its class are created, and without reference to any object.*/
