package scanner;

import java.util.Scanner;

public class UserName {
	private static Scanner input;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the user name:");
		
		String n =input.next();
		
		System.out.println("User Name:"+n);
		
	}

}
