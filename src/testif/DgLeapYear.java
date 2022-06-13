package testif;

import java.util.Scanner;

public class DgLeapYear {

	public static void main(String[] args)
	{
        int year;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Year:");
		year=sc.nextInt();
		if((year%4==0)&&(year%100!=0)||(year%400==0))
		{
			System.out.println(year+""+" is Leap Year......");
		}
		else
		{
			System.out.println("Entered Year is Normal Year......");
		}
	}

}
