package edu.sf04java.consructor;

public class Student {
	public Student() {
        System.out.println("Student object is created");
    }

    public static void main(String[] args) {
        // Creating a Student object to see the message
        Student student = new Student();
        
        // Creating a Commission object and demonstrating its methods
        Commission commission = new Commission();
        commission.acceptDetails();
        commission.calculateCommission();
    }

}
