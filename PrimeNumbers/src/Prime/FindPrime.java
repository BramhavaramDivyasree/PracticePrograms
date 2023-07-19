package Prime;

import java.util.Scanner;

public class FindPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("enter a number to find a prime or not");
		int n=scan.nextInt();
		boolean isPrime=false;
		if(n<2) {
			System.out.println(n+"it is not a prime number");
		}
		else {
		
		for(int i=2;i*i<=n;i++) {
			if(n%i!=0) {
				
				isPrime=true;
				break;
			}
		}
	}
		if(isPrime==true) {
			System.out.println("it is prime");
		}
		else {
				System.out.println("it is not a prime");
		}
		
		
		

	}

}
