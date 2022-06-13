package demoloops;

import java.util.Scanner;

//Write a program in Java to display the cube of the number upto given an integer.
public class Demoforloop7 {

	public static void main(String[] args)
	
	{
		int num,i;
		Scanner sc=new Scanner(System.in);
		System.err.println("Enter the number limit:");
		num=sc.nextInt();
		sc.close();
		
		for(i=1;i<=num;i++)
		{
			
			System.out.println("Number is : " +i+" and cube of " +i+" is : "+(i*i*i));
		}

	}

}
