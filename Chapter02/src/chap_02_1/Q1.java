package chap_02_1;

import java.util.Random;

public class Q1 {
	static int maxOf(int[] a) {
		int max = a[0];
		for(int i = 0; i < a.length; i++) {
			if(a[i] > max) max= a[i];
		}
		return max;
	}
		
	public static void main(String[] args) {
		Random rand = new Random(1);
		
		System.out.println("max?");
		int num = rand.nextInt(10);
		System.out.println("num :" + num);
		
		int[] height = new int[num];
		
		for(int i = 0; i < num; i++) {
			height[i] = 100 +rand.nextInt(90);
			System.out.println("height[" + i + "] : " + height[i]);
		}
		
		System.out.println("max = " + maxOf(height));
		
		

	}


}
