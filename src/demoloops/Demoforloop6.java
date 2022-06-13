//Java Program to find Power of a Number Using For Loop
package demoloops;

import java.util.Scanner;

public class Demoforloop6 {

	public static void main(String[] args) {
		
		int num,exponent,i;
		long power=1;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("please enter the number:");
		num=sc.nextInt();
		
		System.out.println("please enter the exponent:");
		exponent=sc.nextInt();
		
        for(i=1;i<=exponent;i++)
        {
        	power=power*num;	
        }
        System.out.println("\n The Final result of " + num + " power " + exponent + " = " + power);
	}

}
