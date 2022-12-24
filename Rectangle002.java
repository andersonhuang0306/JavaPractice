public class Rectangle002 {
	private double length;
	private double width;
	
	public Rectangle002() {length = 1.0;width = 1.0;}
	public Rectangle002(double len,double wid) {length = len;width = wid;}
	
	public double getLength() {return length;}
	public double getWidth() {return width;}
	public void setLength(double len) {length=len;}
	public void setWidth(double wid) {width=wid;}
	
	public double getCircumference() {return (width+length)*2;} 
	public double getArea() {return width*length;} 
	
	public String toString() {
		return String.format("%s%.2f\n%s%.2f\n%s%.2f\n%s%.2f\n",
				"length: ",getLength(),
				"width: ",getWidth(),
				"Circumference: ",getCircumference(),
				"Area: ",getArea());
	}
	
}