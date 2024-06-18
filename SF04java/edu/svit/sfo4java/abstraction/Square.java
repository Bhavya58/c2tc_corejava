package edu.svit.sfo4java.abstraction;

public  class Square extends Shape {
	
	float side;

	public Square(float side) {
		super();
		this.side = side;
	}
	@Override
	public  float calculateArea() {
		return area=side*side;
	}

}
