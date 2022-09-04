package chapters.chapter_05;

// Repeat Addition Quiz
import java.util.*;

public class E_01 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int number1 = (int) (Math.random() * 11);
		int number2 = (int) (Math.random() * 11);
		System.out.println("What is " + number1 + " + " + number2 + " =?");
		int answer=input.nextInt();
		
		while(number1+number2!=answer) {
			System.out.println("Wrong answer. Try again. What is " + number1 + " + " + number2 + " =?");
			answer=input.nextInt();
		}
		System.out.println("you got it!");

	}

}


