package demo;

public class SimpleInterest {
	
	public static void calculateSimpleInterest(int p,int n, double r) {
		double si = p*n*r/ 100;
		System.out.println(si);
	}
	
	public static void main(String[] args) {
		calculateSimpleInterest(10000,3,12.25);
	}

}
