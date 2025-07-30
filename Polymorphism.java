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
		
	}
}
