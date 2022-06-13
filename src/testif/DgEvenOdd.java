package testif;

import java.util.Scanner;

public class DgEvenOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int no;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number:");
		no=sc.nextInt();
		
		if(no%2==0)
		{
			System.out.println(no+" " +"is Even Number.....");
		}
		else
		{
			System.out.println(no+" " +"is Odd Number.....");
		}

	}

}
