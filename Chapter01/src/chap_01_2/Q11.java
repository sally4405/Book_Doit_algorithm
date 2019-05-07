package chap_01_2;

import java.util.Scanner;

public class Q11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		
		System.out.println("양의 정수의 자릿수를 구합니다.");
		
		while(true) {
			System.out.print("n의 값 : ");
			n = sc.nextInt();
			if (n > 0) break;
			System.out.println("0보다 큰 값을 입력하세요!");
		}
						
		int num = 0;
		
		for(int i = 0; n >= Math.pow(10, i); i++) {
			num = i+1;
		}
		
		System.out.println("그 수는 " + num + "자리입니다.");
		
		
		int no = 0; 			// 자릿수
		while (n > 0) {
			n /= 10; 			// n을 10으로 나눔
			no++;
		}

		System.out.println("그 수는 " + no + "자리입니다.");
		
		sc.close();


	}

}
