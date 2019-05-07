package chap_02_1;

public class ArraySumForln {

	public static void main(String[] args) {
		double[] a = {1.0, 2.0, 3.0, 4.0, 5.0};
		
		for(int i = 0; i < a.length; i++) {
			System.out.println("a[" + i + "] = " + a[i]);
		}
		
		double sum = 0;
		for(double b : a)
			sum += b;
		
		System.out.println("모든 요소의 합은 " + sum + "입니다.");

	}

}
