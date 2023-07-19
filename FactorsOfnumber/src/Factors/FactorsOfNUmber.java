package Factors;

import java.util.Scanner;

public class FactorsOfNUmber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a Number");
		int n=scan.nextInt();
	
		for(int i=1;i<=n;i++) {
			if(n%i==0) {
				System.out.println(i+" ");
			}

			
		}
		//System.out.println("factors of"+n+"is"+factor);
	}

}
