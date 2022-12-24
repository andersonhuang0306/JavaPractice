
public class Circle002 {
	private double radius; 
	/*
	public Circle036() {   
		radius = 1.0;	   
	}					   
	public Circle036(double r) {
		radius = r;
	}
	
	public double getRadius() {
		return radius;
	}
	*/
	public Circle002() {radius = 1.0;}
	public Circle002(double r) {radius = r;}
	public double getRadius() {return radius;}
	public void setRadius(double r) {radius=r;}
	public double getArea() {return Math.PI*radius*radius;} 
	public double getLength() {return 2*Math.PI*radius;}  
	public String toString() {
		return String.format("%s%.2f\n%s%.2f\n%s%.2f\n",
				"Radius: ",getRadius(),
				"Area: ",getArea(),
				"Length: ",getLength());
	}
	
}
