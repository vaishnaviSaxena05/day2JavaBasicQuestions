package day2;

public class FirstEvenNumber {
	public static void main(String[] args) {
		int count = 0;
		for (int i = 1; i <= 100; i++) {
			if (i % 2 == 0) {
				System.out.println("even num is-->" + i);
				count++;
			}

		}
		System.out.println("total number of even is " + count);
	}

}
