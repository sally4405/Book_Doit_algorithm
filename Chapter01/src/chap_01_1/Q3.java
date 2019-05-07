package chap_01_1;

public class Q3 {
	static int min4(int a, int b, int c, int d) {
		int min = a;
		min = (b < min)? b:min;
		min = (c < min)? c:min;
		min = (d < min)? d:min;
		
		return min;
	}
	
	public static void main(String[] args) {
		System.out.println("min4(5,10,15,6) = " + min4(5,10,15,6));

	}
}
