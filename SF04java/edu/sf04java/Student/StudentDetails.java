package edu.sf04java.Student;

import java.util.Scanner;

public class StudentDetails {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for their full name
        System.out.print("Enter your Full name with Initial: ");
        String fullName = scanner.nextLine();

        // Prompt the user for their roll number
        System.out.print("Enter your Roll number: ");
        String rollNumber = scanner.nextLine();

        // Prompt the user for their grade
        System.out.print("Enter your Grade: ");
        String grade = scanner.nextLine();

        // Prompt the user for their percentage
        System.out.print("Enter your Percentage: ");
        String percentage = scanner.nextLine();

        // Print the details
        System.out.println("Sample Output:");
        System.out.println(fullName);
        System.out.println(rollNumber);
        System.out.println(grade);
        System.out.println(percentage);

        // Close the scanner
        scanner.close();
    }


}
