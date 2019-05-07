package chap_01_2;

import java.util.Scanner;

public class Q9 {
	static int sumof(int a, int b) {
		int sum = 0;
		if(a <= b) {
			for(int i = a; i <= b; i++)
				sum += i;
		}
		else for(int i = b; i <= a; i++)
				sum += i;
		return sum;
	}
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("a부터 b까지의 합을 구합니다.");
		System.out.print("a의 값 : ");
		int a = sc.nextInt();
		System.out.print("b의 값 : ");
		int b = sc.nextInt();
		
		int sum = sumof(a,b);
		System.out.println(a + "부터 " + b + "까지의 합은 " + sum + "입니다.");
		
		sc.close();

	}

}
