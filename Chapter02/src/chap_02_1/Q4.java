package chap_02_1;

import java.util.Scanner;

public class Q4 {

	static void copys(int[] a, int[] b) {		
			for(int i = 0; i < b.length; i++)
				a[i] = b[i];			
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
				
		System.out.print("배열 b의 요솟수 : ");
		int nb = sc.nextInt();
		
		int[] b = new int[nb];
		
		for(int i = 0; i< nb; i++) {
			System.out.print("b[" + i + "] : ");
			b[i] = sc.nextInt();
		}
		
		int[] a = new int[nb];
		copys(a,b);
		
		System.out.println("배열 b가 배열 a로 복사되었습니다! ");
		
		for(int i = 0; i < nb; i++) {
			System.out.println("a[" + i + "] : " + a[i]);
		}
		
		sc.close();
	}

}
