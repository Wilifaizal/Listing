package w6;
/*
 * The Circle class models a circle with a radius and color.
 */
public class Circle { 
	// private instance variable, not accessible from outside this class
	private double radius;
	private String color;
	//Constructors (overloaded)
	/** Construct a Circle instance with default value for radius and color*/
	public Circle() {
		radius = 1.0;
		color = "red";
	}
	
	public Circle(double r) {
		radius = r;
		color = "red";
	}
	
	public double getRadius() {
		return radius;
	}
	
	public double getArea() {
		return radius*radius*Math.PI;
	}
	
	public String toString() {
		return "Circle[radius=" + radius + " color=" + color + "]";
	}
}
