package chapters.chapter_05;
// Greatest Common Divisor

import java.util.*;

public class E_08 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("Enter first integer: ");
		int number1 = input.nextInt();
		int greatestCommonDivisior = 0;
		System.out.print("Enter second integer: ");
		int number2 = input.nextInt();
		if (number1 > number2) {
			int temporaryNumber = number1;
			number1 = number2;
			number2 = number1;
		}
		for (int i = 1; i <= number2 / 2; i++) {
			if (number2 % i == 0 && number1 % i == 0) {
				greatestCommonDivisior = i;
			}
		}
		System.out.println(
				"The greatest common divisor for " + number1 + " and " + number2 + " is " + greatestCommonDivisior);
	}
}

