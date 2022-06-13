package testif;

import java.util.Scanner;

//Write a Java program to find the number of days in a month.
public class DemoSwitchnew {

	public static void main(String[] args) 
	
	{
		Scanner sc=new Scanner(System.in);
		
		System.err.println("Enter the month number:");
		int mon=sc.nextInt();

		System.err.println("Enter the year:");
		int yr=sc.nextInt();
		
		int number_Of_DaysInMonth = 0; 
        String MonthOfName = "Unknown";
        
        switch(mon)
        {
        case 1:
            MonthOfName = "January";
            number_Of_DaysInMonth = 31;
            break;
        case 2:
            MonthOfName = "February";
            if ((yr % 400 == 0) || ((yr % 4 == 0) && (yr % 100 != 0))) {
                number_Of_DaysInMonth = 29;
            } else {
                number_Of_DaysInMonth = 28;
            }
            break;
        case 3:
            MonthOfName = "March";
            number_Of_DaysInMonth = 31;
            break;
        case 4:
            MonthOfName = "April";
            number_Of_DaysInMonth = 30;
            break;
        case 5:
            MonthOfName = "May";
            number_Of_DaysInMonth = 31;
            break;
        case 6:
            MonthOfName = "June";
            number_Of_DaysInMonth = 30;
            break;
        case 7:
            MonthOfName = "July";
            number_Of_DaysInMonth = 31;
            break;
        case 8:
            MonthOfName = "August";
            number_Of_DaysInMonth = 31;
            break;
        case 9:
            MonthOfName = "September";
            number_Of_DaysInMonth = 30;
            break;
        case 10:
            MonthOfName = "October";
            number_Of_DaysInMonth = 31;
            break;
        case 11:
            MonthOfName = "November";
            number_Of_DaysInMonth = 30;
            break;
        case 12:
            MonthOfName = "December";
            number_Of_DaysInMonth = 31;
    }
    System.out.print(MonthOfName + " " + yr + " has " + number_Of_DaysInMonth + " days\n");
}
        
		
	}


