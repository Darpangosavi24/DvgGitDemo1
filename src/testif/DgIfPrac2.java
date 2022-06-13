//Write a program that accepts three numbers from the user and prints 
//"increasing" if the numbers are in increasing order, "decreasing" 
//if the numbers are in decreasing order, and "Neither increasing or 
//decreasing order" otherwise.

package testif;

import java.util.Scanner;

public class DgIfPrac2 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the first number:");
		double num1=sc.nextDouble();
		System.out.println("Enter the second number:");
		double num2=sc.nextDouble();
		System.out.println("Enter the third number:");
		double num3=sc.nextDouble();
		
		if(num1<num2 &&num2<num3)
		{
			System.out.println("Increasing Order....");
		}

		else if(num1>num2 &&num2>num3)
		{
			System.out.println("Decreasing Order....");
		}
		else
		{
			System.out.println("Neither increasing or decreasing order...");
		}
	}

}
