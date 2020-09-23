package assignments.Assignment3_Day4_ArithmeticOperators;

public class Ouestion5_SecMinHours {

	public static void main(String[] args) {
		
		
		/*Question-5
*Write a program that outputs the number of hours, minutes, and seconds that corresponds to input total seconds.
-Declare int variables inputSeconds, hours, minutes, seconds
-Initialize the inputSeconds
-Using %(remainder) and / operators, find out how many whole hours, minutes and seconds are in inputSeconds.
-Assign values to the hours, minutes, seconds variables
-Display the result
  Sample Output:
 inputSecond is 3695
 1 hours, 1 minutes, and 35 seconds   */
		
		/*Write a program that outputs the number of hours, minutes, 
		 * and seconds that corresponds to input total seconds. */
		int hour, hourRemain, min, totalMin, minRemain, sec, remSec,totalSec=4000;
		//These are our variables. Only the total seconds to convert will be given.
		remSec = totalSec%60;
		System.out.println(remSec);
		totalMin= (totalSec - remSec) / 60;
		System.out.println(totalMin);
		minRemain=totalSec-(totalSec%60); 
		/* This will convert given total seconds to 
		 * minutes except the remaining seconds less than one minute.*/
		totalMin = minRemain / 60;
		min = totalMin % 60;
		/* This will  give us how many minutes we have less than one hour
		 * after taking the number of hours from total minutes .*/
		hourRemain=(totalMin - (totalMin % 60))  /  60;
		hour = hourRemain % 60;
		// This will  give us how many hours we have 
		sec= totalSec % 60;
		// This will  give us how many seconds remaining we have less than a minute.
		System.out.println(hour + " hours, " + min + " minutes, " + sec + " seconds.");		

	}

}
