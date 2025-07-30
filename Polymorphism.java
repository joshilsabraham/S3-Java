class Shapes {
	public int area(int a,int b) {
		System.out.println("Rectangle");
		return a * b;
	}
	public int area(int a) {
		System.out.println("Square");
		return a*a;
	}
	public int area(float a) {
		System.out.println("Circle");
		return (int) (3.14 * (a*a));
	}
}

public class Polymorphism {
	public static void main(String[] args) {
		Shapes shape = new Shapes();

		int rectangleArea = shape.area(5, 10); // Rectangle
		System.out.println("Area of Rectangle: " + rectangleArea);

		int squareArea = shape.area(7); // Square
		System.out.println("Area of Square: " + squareArea);

		int circleArea = shape.area(4.5f); // Circle
		System.out.println("Area of Circle: " + circleArea);
	}
}
