package SumofNaturalNumbers;

import java.util.Scanner;

public class SumOfNaturalNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int sum=0;
		for(int i=1;i<=n;i++) {
			sum=sum+i;
			
		}
		System.out.println("Sum of first  " + n + " natural numbers is "+sum);

	}

}
