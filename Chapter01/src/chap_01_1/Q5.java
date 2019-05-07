package chap_01_1;

public class Q5 {
	static int med3(int a, int b, int c) {
		if ((b >= a && c <= a) || (b <= a && c>= a)) return a;
		else if ((a > b && c < b) || (a < b && c > b)) return b;
		else return c;
	}

	public static void main(String[] args) {
		System.out.println(med3(5,8,2));

	}

}
