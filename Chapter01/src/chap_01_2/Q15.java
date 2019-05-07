package chap_01_2;

import java.util.Scanner;

public class Q15 {
	static void triangleLB(int n) {
		for(int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print('*');
			}
			System.out.println();
		}
	}
	
	static void triangleLU(int n) {
		for(int i = 1; i <= n; i++) {
			for (int j = 1; j <= n-i+1; j++) {
				System.out.print('*');
			}
			System.out.println();
		}
	}
	
	static void triangleRU(int n) {
		for(int i = 1; i <= n; i++) {
			for(int k = 1; k <= i; k++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= n-i+1; j++) {
				System.out.print('*');
			}
			System.out.println();
		}
	}
	
	static void triangleRB(int n) {
		for(int i = 1; i <= n; i++) {
			for (int k = 1; k <= n-i+1; k++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= i; j++) {
				System.out.print('*');
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		//int n = sc.nextInt();
		//triangleLB(n);
		
		do {
			System.out.print("단수는 ：");
			n = sc.nextInt();
		} while (n <= 0);
		
		triangleLB(n);
		triangleLU(n);
		triangleRU(n);
		triangleRB(n);
		
		sc.close();
	}

}
