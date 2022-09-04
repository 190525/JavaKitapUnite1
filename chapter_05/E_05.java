package chapters.chapter_05;
// Test do-while

import java.util.*;

public class E_05 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int sum = 0;
		int number = -1;
		do {
			System.out.println("Enter a number to sum(enter 0 to finish)");
			number = input.nextInt();
			sum += number;
		} while (number != 0);
		sum += number;
		System.out.println("The result of summation is " + sum);

	}

}


