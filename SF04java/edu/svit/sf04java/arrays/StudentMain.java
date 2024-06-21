package edu.svit.sf04java.arrays;

public class StudentMain {
	
	public static void main(String[] args) {
		Student arr[]=new Student[5];
		arr[0]=new Student(12,"rahul");
		arr[1]=new Student(12,"rohith");
		arr[2]=new Student(12,"ravin");
		arr[3]=new Student(12,"rishi");
		arr[4]=new Student(12,"rahul");
		
		for(Student s:arr) {
			System.out.println("The age of the student:"+s.getAge());
		    
			System.out.println("Name of the student:"+s.getName());
	
	
		}	
	}

}
