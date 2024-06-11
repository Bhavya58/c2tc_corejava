package edu.sf04java.circle;

import java.util.Scanner;

public class Circle {
	private double radius;
    private String color;

    // Method to accept details of the circle
    public void getInput() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the radius of the circle: ");
        radius = scanner.nextDouble();
        scanner.nextLine(); // Consume newline

        System.out.print("Enter the color of the circle: ");
        color = scanner.nextLine();
    }

    // Method to calculate and display the area of the circle
    public void calcArea() {
        double area = Math.PI * radius * radius;
        System.out.println("The area of the circle with radius " + radius + " is: " + area);
    }

    public static void main(String[] args) {
        Circle circle = new Circle();
        circle.getInput();
        circle.calcArea();
    }
}


