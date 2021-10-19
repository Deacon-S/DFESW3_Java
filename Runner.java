package com.qa.main;

public class Runner {
	
	//Main method is what runs
	//Dont run code in main method
	public static void main(String[] args) {
		
		
		// Code runs from MAIN, top to bottom
		System.out.println(3);
		System.out.println(2);
		System.out.println(1);
		
		// Tell my main method to run newMethod
		// type in the name of the new method
		newMethod();
		helloDeacon();
		// As this method is in a different class you must reference the class before you can run the demo
		Demo.imFirst();
		
		
		
		
	}
	
	//newMethod
	//All methods Should be public static void (this will change)
	public static void newMethod() {
		//method body - what runs in method
		System.out.println("Hello World!");
		
	}

	//Make a new method called helloDeacon
	public static void helloDeacon() {
		System.out.println("Hello Deacon");
		
	}
	
	
	
	
}
