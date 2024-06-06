package edu.svit.sf04java.oops;

public class StudentMain {
	public static void main(String[] args) {
		//className objName = new className();
		Student studentOne = new Student();
		System.out.println(studentOne);
		
		Student studentTwo = new Student(101,"Rahul","CSE","Bandalore");
		System.out.println(studentTwo);
	}

}
