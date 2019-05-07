package chap_01_1;

public class Q1 {
	static int max4(int a, int b, int c, int d) {
		int max = a;
		max = (b > max)? b:max;
		max = (c > max)? c:max;
		max = (d > max)? d:max;
		
		return max;
	}
	
	public static void main(String[] args) {
		System.out.println("max4(5,10,15,6) = " + max4(5,10,15,6));

	}

}
