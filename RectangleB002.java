
public class RectangleB002 {
	private double length,width; 

	public RectangleB002() {length = 1.0;width = 1.0;}
	public RectangleB002(double r) {length = r;width = r;}
	
	public double getwidth() {return width;}
	public void setwidth(double r) {width=r;}
	public double getlength() {return length;}
	public void setlength(double r) {length=r;}
	
	public double getCircumference() {return (width+length)*2;} 
	public double getArea() {return width*length;} 
	public String toString() {
		return String.format("%s%.2f\n%s%.2f\n%s%.2f\n",
				"length: ",getlength(),
				"width: ",getwidth(),
				"Circumference: ",getCircumference(),
				"Area: ",getArea());
	}
	
}
