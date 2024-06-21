package edu.svit.sf04java.exception;

import java.util.Scanner;

public class AgeTestMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int age;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the age");
        age=sc.nextInt();
        try {
        	AgeTest.validate(age);
        }catch(InvalidAgeException ex) {
        	System.err.println(ex.getMessage());
        }
        
	}

}
