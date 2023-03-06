package day2;

import java.util.Scanner;

public class IfNumIsPrime {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter num you want to check is prime  ");
		int no = sc.nextInt();

		int count = 0;

		for (int i = 1; i <= no; i++)

		{

			if (no % i == 0)

				count++;
		}

		if (count == 2)

			System.out.println(no + " is prime");

		else

			System.out.println(no + " is not prime");
	}

}
