package demo;

public class Calc {
	
public static void addition(int a, int b) {
		
		int c = a+b;
		System.out.println(c);
	}

	public static void sub(int a,int b) {
		
		
		int c = a-b;
		System.out.println(c);
	}
	
	public static void multi(int a,int b) {
	
		int c = a*b;
		System.out.println(c);
	}
	
	public static void div(int a, int b) {
	

		int c = a/b;
		System.out.println(c);
    }

	public static void main(String[] args) {
		addition(10,20);
		sub(30,20);
		multi(50,10);
		div(30,5);
	}

}
