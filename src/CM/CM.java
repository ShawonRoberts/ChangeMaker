package CM;

import java.util.Scanner;

public class CM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			//Set up input
			Scanner input = new Scanner(System.in);
			//Prompt the user
			System.out.println("This program determines the amount of quarters, dimes, nickles, and pennies that will be returned to a");
			System.out.println("customer after a customer makes a purchase.\n");
			System.out.println("Please enter the change due to the customer (Please note, change should be written with a decimal point e.g., .99 cents) : \n");
			
			double totalChangeDue = input.nextDouble();
			
			System.out.println();
			//Perform Calculations
			int calculatedNumberOfQuarters = calculateNumberOfQuarters(totalChangeDue);
			int calculatedNumberOfDimes = calculateNumberOfDimes(totalChangeDue, calculatedNumberOfQuarters);
			int calculatedNumberOfNickels = calculateNumberOfNickels(totalChangeDue, calculatedNumberOfQuarters, calculatedNumberOfDimes);
			int calculatedNumberOfPennies = calculateNumberOfPennies(totalChangeDue, calculatedNumberOfQuarters, calculatedNumberOfDimes, calculatedNumberOfNickels);
			//Print out totals
			System.out.println("Quarters: " + calculatedNumberOfQuarters);
			System.out.println("Dimes: " + calculatedNumberOfDimes);
			System.out.println("Nickels: " + calculatedNumberOfNickels);
			System.out.println("Pennies: " + calculatedNumberOfPennies);
			//Close the scanner input
			input.close();
			
		}
		
		private static int calculateNumberOfQuarters(double totalChangeDue) {
			
			final int quarterWorth = 25;
			
			int calculatedNumberOfQuarters = (int) ((totalChangeDue * 100) / quarterWorth);
			
			return calculatedNumberOfQuarters;
			
		}
		
		private static int calculateNumberOfDimes(double totalChangeDue, int calculatedNumberOfQuarters) {
			
			final int quarterWorth = 25;
			final int dimeWorth = 10;
			
			int calculatedNumberOfDimes = (int) (((totalChangeDue * 100) - (calculatedNumberOfQuarters * quarterWorth)) / dimeWorth);
			
			return calculatedNumberOfDimes;
			
		}

		private static int calculateNumberOfNickels(double totalChangeDue, int calculatedNumberOfQuarters, int calculatedNumberOfDimes) {
			
			final int quarterWorth = 25;
			final int dimeWorth = 10;
			final int nickelWorth = 5;
			
			int calculatedNumberOfNickels = (int) (((totalChangeDue * 100) - (calculatedNumberOfQuarters * quarterWorth) - (calculatedNumberOfDimes * dimeWorth)) / nickelWorth);
			
			return calculatedNumberOfNickels;
			
		}

		private static int calculateNumberOfPennies(double totalChangeDue, int calculatedNumberOfQuarters, int calculatedNumberOfDimes, int calculatedNumberOfNickels) {
			
			final int quarterWorth = 25;
			final int dimeWorth = 10;
			final int nickelWorth = 5;
			final int pennieWorth = 1;
			
			int calculatedNumberOfPennies = (int) (((totalChangeDue * 100) - (calculatedNumberOfQuarters * quarterWorth) - (calculatedNumberOfDimes * dimeWorth) - (calculatedNumberOfNickels * nickelWorth)) / pennieWorth);
			
			return calculatedNumberOfPennies;
			
		}

	}


