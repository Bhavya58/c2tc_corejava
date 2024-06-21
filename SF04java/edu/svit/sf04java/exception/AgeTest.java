package edu.svit.sf04java.exception;

public class AgeTest {
	public static void validate(int age) throws InvalidAgeException {
		if(age<18) {
			throw new InvalidAgeException("Invalid Age...You are not eligible to vote!");
		}else {
			System.out.println("welcome to vote!");
		}
	}

}
