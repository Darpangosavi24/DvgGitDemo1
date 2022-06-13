package demoloops;

import java.util.Scanner;

//Write a program in Java to display the n terms of odd natural number and their sum.
public class Demoforloop8 {

	public static void main(String[] args)
	
	{
		int num,i,sum=0;
		Scanner sc=new Scanner (System.in);
        System.err.println("Enter the number limit:");
        num=sc.nextInt();
        sc.close();
        //if(num%2!=0)
        System.out.println ("\nThe odd numbers are :");
        for(i=1;i<=num;i++)
        {
        	
        	System.out.println (2*i-1);
        	sum=sum+(2*i-1);
        }
        System.out.println ("The Sum of odd Natural Number upto " +num+" terms is: " +sum);
	}

}
