package chap_01_1;

public class Q4 {
	static int med3(int a, int b, int c) {
			if (a >= b)
				if (b >= c) return b;
				else if (a <= c) return a;
				else return c;
			else if (a > c)
				return a;
			else if (b > c)
				return c;
			else 
				return b;
		}
	
	public static void main(String[] args) {
		for(int i = 1; i < 4; i++) {
			for(int j = 1; j < 4; j++) {
				for(int k = 1; k < 4; k++) {
					System.out.println("med3(" + i + "," + j + "," + k + ") = " + med3(i,j,k));
				}
			}
		}

	}

}
