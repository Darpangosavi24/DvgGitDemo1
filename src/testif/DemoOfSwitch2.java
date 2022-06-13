package testif;

import java.util.Scanner;

public class DemoOfSwitch2 {

	public static void main(String[] args) {
		char operator;
		int num1,num2,result;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Operetor (either, *,+,-,/):");
		operator=sc.next().charAt(0);
		System.out.println("Enter num1 and num2 respectively:");
		num1=sc.nextInt();
		num2=sc.nextInt();
		
		switch (operator) 
		{
           case '+':
           result = num1 + num2;
   	       System.out.print(num1 + "+" + num2 + " = " + result);
           break;
           
           case '-':
               result = num1 - num2;
       	       System.out.print(num1 + "-" + num2 + " = " + result);
               break;
               
           case '*':
               result = num1 * num2;
       	       System.out.print(num1 + "*" + num2 + " = " + result);
               break;
               
           case '/':
               result = num1 / num2;
       	       System.out.print(num1 + "/" + num2 + " = " + result);
               break;
            
           default: 
             System.out.println("Invalid operator!");
             break;
                
           
           
		}

	}

}
