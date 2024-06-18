package edu.svit.sf04java.polymorphism;

public class MethodOverridingMain {
	public static void main(String[] args) {
		Rbi bankOne = new Sbi();
		System.out.println(bankOne.getrateOfInterest());
		Rbi bankTwo = new Hdfc();
		System.out.println(bankOne.getrateOfInterest());
	}

}
