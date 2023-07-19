package MultipleOfTen;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the number");
		int n=scan.nextInt();
		int n2=scan.nextInt();
		checkMultipleOfTen(n);

	}
	public static void checkMultipleOfTen(int n) { 
		if(n%10==0) {			
			System.out.println("the first number is multiple of second number");

		}
		else {
			System.out.println("The first number is not a multiple of second number");
		}
		}
	public static void checkFirstDivideBySecond(int n1,int n2) { 
		if(n1%n2==0) {			
			System.out.println("the first number is multiple of second number");

		}
		else {
			System.out.println("The first number is not a multiple of second number");
		}
		}
	
	}


