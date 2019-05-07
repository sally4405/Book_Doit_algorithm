package chap_02_1;

import java.util.Scanner;

public class Q7 {

	static int cardConvEx(int x, int r, char[] d){
		int digits = 0;
		String dchar = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		
		do {
			d[digits++] = dchar.charAt(x % r);
			x /= r;
		} while (x != 0);
		
		for (int i = 0; i < digits / 2; i++) { 
			char temp = d[i]; 
			d[i] = d[digits - i - 1];
			d[digits - i - 1] = temp;
		}
		return digits;
	}
		
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int no;
		int cd;
		int dno;
		int retry;
		char[] cno = new char[32];
		
		System.out.println("10진수를 기수 변환합니다.");
		do {
			do {
				System.out.print("변환하는 음이 아닌 정수 : ");
				no = sc.nextInt();
			} while (no < 0);
			
			do {
				System.out.print("어떤 진수로 변환할까요? (2~36) : ");
				cd = sc.nextInt();
			} while (cd < 2 || cd > 36);
			
			dno = cardConvEx(no, cd, cno);
			
			System.out.println(cd + "|     " + no);
			System.out.println(" +-------");
			for(int i = 0; i < dno+1; i++) {
				//no = no/cd;
				if(no/cd != 0) {
					System.out.println(cd + "|     " + no + " ... " + no%cd);
					System.out.println(" +-------");
				}
				else {
					System.out.println("       " + no + " ... " + no%cd);
					//System.out.println(" +-------");
				}
				no = no/cd;
			}
		
			System.out.print(cd + "진수로는 ");
			for (int i = 0; i < dno; i++)
				System.out.print(cno[i]);
			System.out.print("입니다.");
			
			System.out.print("한번 더 할까요? (1.예 / 0.아니오) : ");
			retry = sc.nextInt();
		} while (retry == 1);
		
		sc.close();

	}
}
