package chapters.chapter_05;
// Guessing Numbers

import java.util.*;
public class E_02 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int number=(int)(Math.random()*101);
		System.out.println("Guess number!");
		int guess=input.nextInt();
		/*while(number!=guess) {
			if(guess<number) {
				System.out.println("Guess is too  low.");
			}else {
				System.out.println("Guess is too high.");
			}
			System.out.println("Guess number again.");
			guess=input.nextInt();
		}
		System.out.println("Guess is correct.");*/
		
	}

}


