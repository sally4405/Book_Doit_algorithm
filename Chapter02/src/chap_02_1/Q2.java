package chap_02_1;

import java.util.Scanner;

public class Q2 {

	static void swap(int a[], int b, int c) {
		int t = a[b]; a[b] = a[c]; a[c] = t;
	}
	
	static void print(int[] a) {
		for (int i = 0; i < a.length; i++)
			System.out.print(a[i] + " ");
		System.out.println();
	}
	
	static void reverse(int a[]) {
		print(a);
		for(int i = 0; i < a.length/2;  i++) {			
			swap(a, i, a.length - i - 1);
			System.out.println("a[" + i + "]과(와) a[" + (a.length - i - 1) + "]를 교환합니다.");
			print(a);
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

		//reverse(x);
		
		System.out.println();
		System.out.println("reverse!");
		System.out.println();
		
		reverse(x);
//		for(int i = 0; i < num; i++) {
//			System.out.println("x[" + i + "] = " + x[i]);
//			swap(x, i, x.length - i -1);
//		}
		System.out.println("역순 정렬을 마쳤습니다.");
		sc.close();
	}

}
