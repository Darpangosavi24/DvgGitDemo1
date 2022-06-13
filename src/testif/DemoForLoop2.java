package testif;

import java.util.Scanner;

public class DemoForLoop2 {

	public static void main(String[] args) {
		int maxMultiples=10;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number you want to multiple of:");
		
		int multipleof=sc.nextInt();
		for (int i=1;i<=maxMultiples;i++)
		{
			int answer=i * multipleof;
			System.out.printf("%d * %d =%d\n",i,multipleof,answer);
		}
		

	}

}
