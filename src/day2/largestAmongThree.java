package day2;

import java.util.Arrays;
import java.util.Scanner;

public class largestAmongThree {
	public static void main(String[] args) {
		// 28,3,56
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter num1 ");
		int num1 = sc.nextInt();
		System.out.println("enter num2 ");
		int num2 = sc.nextInt();
		System.out.println("enter num3 ");
		int num3 = sc.nextInt();
		System.out.println(num1+" , "+num2+" , "+num3);
		if (num1>num2&&num1>num3) {
			System.out.println("largest num is --> "+num1);
			
		}else if(num2>num1&&num2>num3)  {
			System.out.println("largest num is --> "+ num2);
		}
		else {
			System.out.println("largest num is --> "+num3);
		}
	}

}
