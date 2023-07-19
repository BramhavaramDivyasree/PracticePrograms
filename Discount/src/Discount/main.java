package Discount;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the purchase amount");
		double d=scan.nextDouble();
		checkDiscount(d);  
		

	}

			public static void checkDiscount(double purchase) {
				
				if(purchase>100) {
					System.out.println("Discount applicable");
					
			}
				else {
					System.out.println("Not Applicable Discount");
				}
		}
	}
   



