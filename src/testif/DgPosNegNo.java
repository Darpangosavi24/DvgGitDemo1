package testif;

import java.util.Scanner;

public class DgPosNegNo {

	public static void main(String[] args) {
		
		int no;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number:");
		no=sc.nextInt();
		
	if(no>0)
	{
        System.out.println(no+" is Positive Number.....");
	}
	else if(no<0)
	{
		System.out.println(no+" is Negative Number....");
	}
	else 
	{
		System.out.println(no+" is neither positive nor negative....");
	}
	}
}
