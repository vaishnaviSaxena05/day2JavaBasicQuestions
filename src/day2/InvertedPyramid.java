package day2;

public class InvertedPyramid {
	public static void main(String[] args) {
		for(int i=7;i>=1;i--) {
			for(int j=i;j<7;j++) {
				System.out.print(" ");
			}
			for(int j=1;j<=i-1;j++) {
				System.out.print(" *");
			}
			System.out.println();
		}
	}

}
