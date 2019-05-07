package chap_01_2;

import java.util.Scanner;

public class Q10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a;
		int b;
		
		System.out.println("b-a를 구합니다.");
		
		System.out.print("a의 값 : ");
		a = sc.nextInt();
		
		while(true) {
			System.out.print("b의 값 : ");
			b = sc.nextInt();
			if (b > a) break;
			System.out.println("a보다 큰 값을 입력하세요!");
		}
		
		
		int total = b-a;
		System.out.println(b + " - " + a + " = " + total + " 입니다.");
		
		sc.close();


	}

}
