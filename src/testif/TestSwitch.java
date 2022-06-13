package testif;

import java.util.Scanner;

//Write a Java program that keeps a number from the user and generates an integer between 1 and 7 
 //and displays the name of the weekday
public class TestSwitch {

	public static void main(String[] args) 
	
	{
		Scanner sc=new Scanner(System.in);
		System.err.println("Enter the input number:");
		int day=sc.nextInt();
		
		System.err.println(getDayName(day));
		
	}
	   public static String getDayName(int day) {
	        String dayName = "";
	        
	        switch(day)
	        {
	        case 1: dayName = "Monday"; break;
            case 2: dayName = "Tuesday"; break;
            case 3: dayName = "Wednesday"; break;
            case 4: dayName = "Thursday"; break;
            case 5: dayName = "Friday"; break;
            case 6: dayName = "Saturday"; break;
            case 7: dayName = "Sunday"; break;
            default:dayName = "Invalid day range";
	        }
	        return dayName;
		
		/*int i_day=3;
		String s_day="Monday";
		
		switch(i_day) {
		
		case 1:
			System.out.println("Today is Monday");
			break;
		case 2:
			System.out.println("Today is Tuesday");
			break;
		case 3:
			System.out.println("Today is Friday");
			break;
			
			default:
				System.out.println("today is sunday");
				
		}*/
		
		/*switch(s_day)
		{
		
		case 1:
			    System.out.println();
		}*/

	}

}
