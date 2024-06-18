package edu.svit.sfo4java.abstraction;

public  class Rectangle extends Shape {
	
	float length,width;
	
	

	public Rectangle(float length, float width) {
		super();
		this.length = length;
		this.width = width;
	}
	
	@Override
	public float calculateArea() {
		// TODO Auto-generated method stub
		return area=length*width;
	}


	

}
