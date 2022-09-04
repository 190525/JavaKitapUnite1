Guessing Numbers-2package chapters.chapter_05;
//Guessing Numbers-2

import java.util.*;
public class E_02_2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int number=(int)(Math.random()*101);
		
		while (true) {
			
			 System.out.print("\nEnter your guess: ");
			 int guess = input.nextInt();
			if (guess == number)
			 System.out.println("Yes, the number is " + number);
			else if (guess > number)
			 System.out.println("Your guess is too high");
			else
			 System.out.println("Your guess is too low");
			} 

	}

}


