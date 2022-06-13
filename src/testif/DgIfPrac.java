//Write a Java program that reads a floating-point number and prints
//"zero" if the number is zero. Otherwise, print "positive" or "negative"
//Add "small" if the absolute value of the number is less than 1, or 
//"large" if it exceeds 1,000,000.

package testif;

import java.util.Scanner;

public class DgIfPrac {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		double num=sc.nextDouble();
		
		if(num>0)
		{
			if(num<1)
			{
				System.out.println("Given number is positive small number...");
			}
			else if(num>1000000)
			{
				System.out.println("Given number is  positive large number...");
				
			}
			else
            {
                System.out.println("Positive number");
            }
		}
		else if(num<0)
		{
			if(Math.abs(num)<1)
			{
				System.out.println("Given number is negative small number...");
			}
			else if (Math.abs(num) > 1000000)
            {
                System.out.println("Negative large number");
            }
            else
            {
                System.out.println("Negative number");
            }
		}
		else
        {
            System.out.println("Zero");
        }

	}

}
