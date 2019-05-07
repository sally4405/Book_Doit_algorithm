package chap_01_2;

import java.util.Scanner;

public class Q17 {
	static void nsprira(int n) {
		for(int i = 1; i <= n; i++) {
			for(int k = 1; k <= n-i; k++) {
				System.out.print(" ");
			}
			for(int j = 1; j <= i*2-1; j++) {
				System.out.print(i%10);
			}
			System.out.println();
		}
	}
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		
		do {
			System.out.print("단수는 ：");
			n = sc.nextInt();
		} while (n <= 0);
		
		nsprira(n);
		
		sc.close();
		
	}
}
