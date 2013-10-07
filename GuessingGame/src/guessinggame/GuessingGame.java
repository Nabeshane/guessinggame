package guessinggame;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Random;

public class GuessingGame {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Random randomNumber = new Random();
		int actualNumber = randomNumber.nextInt(101);
		System.out.println ("I am thinking of a number between 1 and 100, can you guess what it is?");
		BufferedReader myReader = new BufferedReader(new InputStreamReader(System.in));
		try {
			int myAnswer = Integer.parseInt(myReader.readLine());
			if (myAnswer == actualNumber) {
				System.out.println("You win!");
			}
			else if (myAnswer > actualNumber) {
				System.out.println("You were incorrect, the number was lower!");
			}
			else if (myAnswer < actualNumber) {
				System.out.println("You were incorrect, the number was higher!");
			}
		}
		catch (Exception e) {
			System.out.println("An error as occured, did you not enter a number?");
		}
	}

}
