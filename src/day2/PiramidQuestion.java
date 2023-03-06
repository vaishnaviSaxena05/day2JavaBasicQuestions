package day2;

public class PiramidQuestion {
public static void main(String[] args) {
	//outer loop 
	for(int i=1;i<=7;i++) {
		//inner loop
		for(int j=1;j<=7-i;j++) {
			System.out.print(" ");
		}
		//loop for printing star
		for(int j =1;j<=i;j++) {
			System.out.print("* ");
		}
		System.out.println();
	}
}
}
