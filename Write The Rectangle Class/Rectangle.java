public class Rectangle {
	private double length = 1;	
	private double width = 1;	
	private String color = "red";
	private boolean fill = false;
	
	public Rectangle() {
		
	}
	
	public Rectangle(double l, double w, String c, boolean f) {
		length = l;
		width = w;
		color = c;
		fill = f;
	}
	
	public void setLength(double value) {
		length = value;
	}
	
	public double getLength() {
		return length;
	}
	
	public void setWidth(double value) {
		width = value;
	}
	
	public double getWidth() {
		return width;
	}
	
	public void setColor(String value) {
		color = value;
	}
	
	public String getColor() {
		return color;
	}
	
	public void setFill(boolean value) {
		fill = value;
	}
	
	public boolean getFill() {
		return fill;
	}
	
	public double getArea() {
		double area = length * width;
		
		return area;
	}
	
	public double getPerimeter() {
		double perimeter = (2 * length) + (2 * width);
		
		return perimeter;
	}
	
	public String toString() {
		String str = "A rectangle has been created with the following attributes:\nLength: " + length + "\nWidth: " + width + "\nColor: " + color + "\nArea: " + getArea() + "\nPerimeter: " + getPerimeter();

		return str;
	}

	public double getDiagonal() {
		double c = Math.sqrt(Math.pow(length, 2) + Math.pow(width, 2));

		return c;
	}

	public static void main(String[] args) {
		Rectangle r = new Rectangle(3, 4, "blue", true);

		System.out.println(r);
	
		System.out.println("The length of the diagonal is " + r.getDiagonal());
	}
}


