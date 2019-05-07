package chap_02_1;

import java.util.Scanner;

public class ReverseArray {
	static void swap(int a[], int b, int c) {
		int t = a[b]; a[b] = a[c]; a[c] = t;
	}
	
	static void reverse(int a[]) {
		for(int i = 0; i < a.length/2;  i++) {
			swap(a, i, a.length - i - 1);
		}
	}
		
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("num : ");
		int num = sc.nextInt();
		
		int[] x = new int[num];
		
		for(int i = 0; i < num; i++) {
			System.out.print("x[" + i + "] : ");
			x[i] = sc.nextInt();
		}

		reverse(x);
		
		System.out.println("reverse!");
		for(int i = 0; i < num; i++) {
			System.out.println("x[" + i + "] = " + x[i]);
		}
		
		sc.close();
	}

}
