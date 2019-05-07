package chap_01_1;

public class Max3m {
	
	static int max3(int a, int b, int c) {
		int max = a;
		if(b > max) max = b;
		if(c > max) max = c;
		
		return max;
	}

	public static void main(String[] args) {
		for(int i = 1; i < 4; i++) {
			for(int j = 1; j < 4; j++) {
				for(int k = 1; k < 4; k++) {
					System.out.println("max3(" + i + "," + j + "," + k + ") = " + max3(i,j,k));
				}
			}
		}

	}

}
