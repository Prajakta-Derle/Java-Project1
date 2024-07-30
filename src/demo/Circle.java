package demo;

public class Circle {
	
	public static void calculateAreaOfCircle(double pi,int radius) {
		double area = pi * radius * radius;
		System.out.println(area);
	}
	
	public static void main(String[] args) {
		calculateAreaOfCircle(3.14,10);
	}

}
