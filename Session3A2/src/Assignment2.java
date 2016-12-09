import java.util.ArrayList;
import java.util.Scanner;

/*
 * This assignment will test your skills on creating class and its objects learnt in the class.
A prime number (or a prime) is a natural number greater than 1 that has no positive divisors
other than 1 and itself. A natural number greater than 1 that is not a prime number is called a
composite number.
 * 
 * Write a simple Java program to check whether a given number is a prime number or not
 * 
 * Should print whether the given number is a prime number or not
 */

public class Assignment2 {

	public static void main(String[] args) {
		Assignment2 a2 = new Assignment2();
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Input an integer to test for prime: ");
		int amIPrime = scan.nextInt();
		System.out.println("Prime? = " + a2.primeTest(amIPrime));

	}

	public boolean primeTest(int input) {

		if (input == 1 || input == 2)
			return true;

		for (int j = 2; j < input; j++) {
			if ((input % j) == 0) { // no remainder means not prime
				return false;
			}

			
		}
		return true;
	}
}
