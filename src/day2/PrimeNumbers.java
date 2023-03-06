package day2;

import java.util.Scanner;

public class PrimeNumbers {
public static void main(String[] args) {
	  Scanner scanner = new Scanner(System.in);

	int count=0; 
	 System.out.println("Enter the value of n:");
     int n = scanner.nextInt();
	for(int i=1;i<=100;i++) {
		  int counter=0; 
		for( n=i;n>=1;n--)
		if (i%n==0) {
			counter = counter + 1;
			
		}
		if(counter==2) {
			System.out.println(i);
		}
		
	}
	
}
}
