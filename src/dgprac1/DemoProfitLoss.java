//Java Program to Calculate Profit or Loss

package dgprac1;

import java.util.Scanner;

public class DemoProfitLoss {

	public static void main(String[] args) {
		
		float unitprice,saleamount,amount;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("please enter the unit price:");
		unitprice=sc.nextFloat();
		
		System.out.println("please enter the sale amount:");
		saleamount=sc.nextFloat();

		if(saleamount>unitprice)
		{
			amount=saleamount-unitprice;
			System.out.println("Profit is :"+amount);
		}
		else if(unitprice>saleamount)
		{
			amount=unitprice-saleamount;
			System.out.println("Loss is:"+amount);
		}
		else
		{
			System.out.println("No Profit No Loss");
		}
	}

}
