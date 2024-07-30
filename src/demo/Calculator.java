package demo;

public class Calculator {
	
	public static void addition() {
		
		int a = 10;
		int b = 20;
		int c = a+b;
		System.out.println(c);
	}
	public static void sub() {
		
		int a = 20;
		int b = 10;
		int c = a-b;
		System.out.println(c);
	}
	public static void multi() {
	
	int a = 10;
	int b = 20;
	int c = a*b;
	System.out.println(c);
	}
	public static void div() {
	
	int a = 50;
	int b = 2;
	int c = a/b;
	System.out.println(c);
    }

	public static void main(String[] args) {
		addition();
		sub();
		multi();
		div();
	}

}
