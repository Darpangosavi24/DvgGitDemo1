//Print Even Numbers from 1 to N

package demoloops;

import java.util.Scanner;

public class Demoforloop4 {

	public static void main(String[] args)
	{
		int num,i;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number limit:");
		num=sc.nextInt();
		sc.close();
		
		for(i=1;i<=num;i++)
		{
			if(i%2==0)
			{
				System.out.print(i+"\t");
			}
		}

	}

}
