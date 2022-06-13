//Java program to print table of an integer number

package demoloops;

import java.util.Scanner;

public class Demoforloop3 {

	public static void main(String[] args) {
		int num,i;
		Scanner sc= new Scanner (System.in);
		System.out.println("Enter the number:");
		num=sc.nextInt();
		sc.close();
		//print table
        System.out.println("Table of " + num + " is ");
		for (i=1;i<=10;i++)
		{
			System.out.println(i*num);
			//System.out.println(i);
		}
		

	}

}
