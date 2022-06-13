//Java Program to Print Multiplication Table

package demoloops;

import java.util.Scanner;

public class Demoforloop5 {

	public static void main(String[] args) 
	{
		int num=1,i,j;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		num=sc.nextInt();
		
		for(i=num;i<10;i++)
		{
			for(j=1;j<=10;j++)
			{
				System.out.println(i+"*"+j+"="+i*j);
			}
			System.out.println("================");
		}
		

	}

}
