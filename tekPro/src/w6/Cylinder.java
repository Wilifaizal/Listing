package w6;

public class Cylinder extends Circle {
	private double height; //private variable
	
	//Constructor with default color, radius and height
	public Cylinder() {
		super(); //call superclass no-arg constructor Circle()
		height = 1.0;
	}
	
	//Constructor with default radius, color but given height
	public Cylinder(double height) {
		super(); //call superclass 
		this.height = height;
	}
	
	public double getHeight() {
		return height;
	}
	
	//A public method for computing the volume of cylinder
	// use superclass method getArea() to get the base arez
	public double getVolume() {
		return getArea()*height;
		
	}

}
