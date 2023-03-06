package day2;

public class FibonacciNumber {
	public static void main(String[] args) {
		int n = 10;
		int num1 = 0;

		int num2 = 1;
		int x = 0;
		while (x < n) {
			System.out.println(num1 + " ");
			int num3 = num2 + num1;
			num1 = num2;
			num2 = num3;
			x = x + 1;

		}
		System.out.println(n);
	}

}
