package testif;

import java.util.Scanner;

public class IfCond_Else {

	public static void main(String[] args)
	
	{
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number:");
		int num=sc.nextInt();
        System.out.println(num);
        
        if (num%2==0)
        {
        	System.out.println("this is Even number "+num);
        }
        else 
        {
        	System.out.println("This is odd number\n"+num);
        }
	}

}
