package edu.svit.sf04java.exception;

public class ExceptionDemo {
	
	public static void main(String[] args) {
		
		try {
			int x[]=new int[] {1,19,12,2,4};
			System.out.println("the element at 1st index: "+x[1]);
			System.out.println("the element at 5th index: "+x[5]);
		}catch(Exception e) {
			System.out.println("Index is out of bound for length 5:");
		}
		System.out.println("hello world");
		System.out.println("This will not execute");
		
		try {
			int z=0;
			int d=42/z;
			System.out.println("The value in d:"+d);
		}catch(ArithmeticException a){
			System.out.println("Arithmetic exception occured: "+a.getMessage());
		}	
			finally {
		
			System.out.println("Inside finally block");
		}
		
//		int z=0;
//		int d=42/z;
//		System.out.println("The value in d:"+d);
	}

}
