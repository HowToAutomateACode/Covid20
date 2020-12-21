package com.java.basics;

public class ForLoop {

	public static void main(String[] args) {
		// for (initialization; termination; increment) {
	 	// statement(s) }
		
	int a =5;
	    ++a;
		System.out.println(a);
		
	for(int i = 1; i<=10; i++) {
		System.out.println(i);
	}
		
		
		for (int i = 0; i <= 10; i = i + 1) { 
			System.out.println(i); 
		}
		
		
		// for each loop
		
		String cars [] = {"Toyota", "Honda", "Ford", "GMC"};
		System.out.println("Array length is:"  + cars.length);
		
		/*
	
		for (type variableName : arrayName) { 
			// code block to be executed 
		} */

		for(String car : cars)
			System.out.println(car);

		int num [] = {3,4,5,8,2};
		
		System.out.println("Number array length: " +num.length);
		 
		for(int nums : num) {
			System.out.println(nums);
		}
		

	}

}
