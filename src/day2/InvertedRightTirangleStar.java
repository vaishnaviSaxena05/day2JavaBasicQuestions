package day2;

public class InvertedRightTirangleStar {
	public static void main(String[] args) {
		for(int i=7;i>0;i--)
        {
           for(int j=0;j<i;j++)
           {
               System.out.print("*");
           }
           System.out.println();
        }
	}

}
