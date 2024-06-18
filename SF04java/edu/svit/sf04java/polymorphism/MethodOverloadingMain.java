package edu.svit.sf04java.polymorphism;

public class MethodOverloadingMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Addition of two numbers:"+MethodOverloading.addition(10, 10));
		System.out.println("Addition of two numbers:"+MethodOverloading.addition(10, 10.5f));
		System.out.println("Addition of two numbers:"+MethodOverloading.addition(11.5f, 10));
		System.out.println("Addition of two numbers:"+MethodOverloading.addition("helloworld", "java"));
	}

}
