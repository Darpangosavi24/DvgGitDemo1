package testif;

import java.util.Scanner;

public class DgSwitchTest3
{

	public static void main(String[] args)
	{
		 //boolean isEligible=false;
		int age=24;
		/*Scanner sc= new Scanner(System.in);
		System.out.println("Enter your age:");
		age=sc.nextInt();
		sc.close();*/
		
		switch(age)
		{
		case (15):
			
		    
		case (24):
			System.out.println("You are eligible for voting.....");
		break; 
		case (60):
			
		default:  
            System.out.println("Please give the valid age.");  
            break; 
		}

	}

}
