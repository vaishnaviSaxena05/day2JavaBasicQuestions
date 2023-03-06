package day2;

public class SumOfEvenNum {
	public static void main(String[] args) {
		int n= 30;
		int sum=0;
		for(int i=10;i<=n;i++) {
			if(i%2==0) {
				 sum= sum+i;
			}
		}
		System.out.println("sum of even num is "+sum);
	}

}
