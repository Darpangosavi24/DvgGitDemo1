package demoloops;

import java.util.Scanner;

// program to find sum of natural numbers using for loop
public class DemoForLoop2 {

	public static void main(String[] args) {
		
             int count,num=0,total=0;
             System.out.println("Enter the number:");
             Scanner sc=new Scanner(System.in);
             num=sc.nextInt();
             sc.close();
             
             for(count=1;count<=num;count++)
             {
            	 total=total+count;
            	 //System.out.println("Sum of first 10 natural numbers is:"+total); 
             }
             System.out.println("Sum of first "+num+" natural numbers is:"+total); 
	}

}
