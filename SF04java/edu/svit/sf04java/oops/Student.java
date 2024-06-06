package edu.svit.sf04java.oops;//package declaration

public class Student {
	private int id;
	private String name;
	private String department;
	private String location;
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	//parameterized constructor
	public Student(int id, String name, String department, String location) {
		super();
		this.id = id;
		this.name = name;
		this.department = department;
		this.location = location;
	}
	
	//getters and setters
	public int getid()
	{
		return id;
	}
	public void setid(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	
	//toString()
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", department=" + department + ", location=" + location + "]";
	}
	
	

}
