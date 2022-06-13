//Java Program to Print 1 to 100 without Loop

package dgprac1;

public class Dgtest1 {

	public static void main(String[] args) 
	{
		int num=1;
		printNumbers(num);
		

	}
   public static void printNumbers(int number)
   {
	   
	   if(number <=100)
	   {
		   System.out.print(number+ " ");
		   printNumbers(number+1);
	   }
   }
}
