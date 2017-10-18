


/**Program Guessing game2

 * 
 * Modify the initial prompt welcoming the user to the guessing game and ask whether they 
 * want to guess or provide the secret number.
 * 
 * If they choose to provide the secret number then the game proceeds 
 * as before except the computer provides the guesses
 * 
 *  At the end of each game, give the user three choices: 
 */


import java.util.Random;
import java.util.Scanner;


/**
 * 
 * @author chrissowden
 *
 */

public class GuessingGame {

	// private static Scanner scan;
	static Scanner scan = new Scanner(System.in);
	static Random rand = new Random();
/**
 * 
 * @param args
 */
	public static void main(String[] args) {
		int answer = 0;
		int choice = 0;
		Player p1 = new Player();
		Player comp = new Player();
		comp.setname("Homey Da Clown");
		System.out.println("Welcome to the Guessing Game!\n");
		System.out.println("What is your name!\n");
		String name = scan.nextLine();
		p1.setName(name);
		System.out.println("Hello"+ name);
		
		 
		
		while (true) {

		 System.out.println("You're the next contestant on the guessing numbers game?:");
		 System.out.println("   1) You verus the Computer.");
		 System.out.println("   2) Computer verus you.");
		 System.out.println("   3) Quit the Program.");
		 
		 
		 //menu option 1
		 choice = scan.nextInt();
		 if (choice == 1) {
			 System.out.println(" Choose a range from Zero to \n 1 50\n 2.100\n 3.500\n 4.1000\n 5.5000\n 6.10,000\n");
			 choice = scan.nextInt();
			 if (choice == 1){
			 youGuess(50);
		 }
			 else if (choice == 2){
				 youGuess(100);
		 }	 
			 else if(choice == 3){
				 youGuess(500);
		 }	 
			 else if (choice == 4){
				 youGuess(1000);
		 }	 
			 else if (choice ==  5){
				 youGuess(5000);
		 }	 
			 else if  (choice == 6){
				 youGuess(10000);
		 }	 
			 
		 }	 
		 //menu option 2
		

		 else if (choice == 2) {
			 System.out.println(" Choose a range from Zero to \n 1 50\n 2.100\n 3.500\n 4.1000\n 5.5000\n 6.10,000\n");

			 if (choice == 1){
			 compGuess(50);

			 }
				 else if (choice == 2){
					 compGuess(100);
			 }	 
				 else if(choice == 3){
					 compGuess(500);
			 }	 
				 else if (choice == 4){
					 compGuess(1000);
			 }	 
				 else if (choice ==  5){
					 compGuess(5000);
			 }	 
				 else if  (choice == 6){
					 compGuess(10000);
			 }	 
				 
			 }	 
			 
		 
		//this tells the program to quit 
		 else if (choice == 3) {
			 System.out.println("Why did you Quit!!!");
			 break;
		 }
		 else {
			 System.out.println("Incorrect input, try again");
		 }
		 
		 
		 
	   } 
	}

	
	 
/**
 * 
 * @param range
 */
	private static void compGuess(int range) {
		int tries = 0;
		boolean correct = false;
		int low = 0;
		int high = 100;
		int answer = scan.nextInt();
		int guess = rand.nextInt(range +1);

		System.out.println("What is your secret number?");
		answer = scan.nextInt();
		while (correct != true) {
			
			tries++;
			System.out.println("Computer guessed " + guess + ".");
			if (guess == answer) {
				System.out.println("Computer Guessed Correctly in " + tries + "!");
				correct = true;
			}
			;
			if (guess > answer) {
				System.out.println("Too high.");
				high = guess;
				guess = (low + high) / 2;
			} else if (guess < answer) {
				System.out.println("Too low.");
				low = guess;
				guess = (low + high) / 2;
			}
		}

	}

	
/**
 * 
 * @param range
 */
	private static void youGuess(int range) {
		boolean correct = false;
		int guess = 0;
		int tries = 0;
		int answer = 0;
		answer = rand.nextInt(100);
		System.out.println("Guess a number between 1 and " + range);

		while (correct != true) {

			tries++;
			System.out.println("Guess a number:  ");
			System.out.println("   This is attempt:" + tries);
			guess = scan.nextInt();

			if (guess == answer) {
				System.out.println("You did it!!! Attemps were " + (tries + 1) + " tries!\n");
				correct = true;
			} else if (guess < answer) {
				System.out.println("Your guess was too LOW, guess again.");
			} else if (guess > answer) {
				System.out.println("Your guess was too HIGH, guess again.");
			}

		}

	}
}
