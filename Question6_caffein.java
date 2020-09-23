package assignments.Assignment3_Day4_ArithmeticOperators;

public class Question6_caffein {

	public static void main(String[] args) {
		
	/*Question-6
Scientists estimate that roughly 10 grams of caffeine consumed at one time is a lethal overdose.
Write a program with a variable that holds the number of milligrams of caffeine in a drink and 
outputs how many drinks it takes to kill a person.
 	Sample Output
  	Number of milligrams in drink: 500
    It would take about 20 drinks for a lethal overdose    */
		
		
		/* Write a program with a variable that holds
		 * the number of miligrams of caffeine
		 * in a drink and outputs how many drinks it takes to kill a person  */
		
		
		int mgCaffein_ounce_12_can = 34;
		int mgCaffein_ounce_16_cup= 160;
		
		int LethalnumberOfCans;
		int LethalnumberOfCups;
		
		
		LethalnumberOfCans = (10_000/mgCaffein_ounce_12_can)+1; // We added one because the result is 62.5
		LethalnumberOfCups = (10_000/mgCaffein_ounce_16_cup)+1;// We add one because the result is 294.12
	
		
	System.out.println("Number of milligrams in a (16-ounce) cup of coffee:  " +  mgCaffein_ounce_16_cup+ " mgs" );
	System.out.println("It would take about " + (LethalnumberOfCups) + " cups of coffee for a lethal overdose" );
		
	System.out.println("\nNumber of milligrams in a (12-ounce) can of cola :  " +  mgCaffein_ounce_12_can+ " mgs" );
	System.out.println("It would take about " + (LethalnumberOfCans) + " cans of cola for a lethal overdose" );
		
		
		
		
		
	
	}

}
