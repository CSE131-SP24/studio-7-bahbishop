package studio7;

public class Rectangle {
private int length;
private int width;

public Rectangle (int initLength, int initWidth) {
	length = initLength;
	width = initWidth;
}

public int area() {
	return length * width;
}

public int perimeter() {
	return (2 * length) + (2 * width);
}

public boolean isSmallerThan(Rectangle twin) {
	return this.area() < twin.area();
	}

public boolean isASquare() {
	return this.length == this.width;
}

public static void main(String[] args) {
	
	Rectangle r1 = new Rectangle(5,5);
	System.out.println(r1.area());
	System.out.println(r1.perimeter());
	
	Rectangle r2 = new Rectangle(30,30);
	System.out.println(r1.isSmallerThan(r2));
	System.out.println(r1.isASquare());
}
}