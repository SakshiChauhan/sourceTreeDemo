package com.calculator;

public class Calculator {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Calcualtor service.");
		System.out.println(sum());
		System.out.println(sub());
		System.out.println(multiply());
		System.out.println(div());
	}
	
	public static int multiply(){
		return 6*4;
	}
	
	public static int sum(){
		return 3+5;
	}
	
	public static int sub(){
		return 10-3;
	}
	
	public static int div(){
		return 112/2;
	}

}
