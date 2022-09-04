package chapters.chapter_05;

// Multiple Subtraction Quiz
import java.util.*;

public class E_03 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int answer = -1;
		int count=0;
		int correctcount=0;
		int falsecount=0;
		final int NUMBER_OF_QUESTIONS = 5;
		String output="";
		long startTime = System.currentTimeMillis();
		while (count<NUMBER_OF_QUESTIONS) {
			int number1 = (int) (Math.random() * 10);
			int number2 = (int) (Math.random() * 10);

			if (number1 < number2) {
				int temporary = number2;
				number2 = number1;
				number1 = number2;
			}
			answer = number1 - number2;
			System.out.println("What is " + number1 + " - " + number2 + " =?");
			int guess = input.nextInt();
			if(answer==guess) {
				System.out.println("You got it!");
				output += "\n" + number1 + "-" + number2 + "=" + answer +" correct" ;
				correctcount++;
			}else {
			System.out.println("Wrong answer!");
			output += "\n" + number1 + "-" + number2 + "=" + answer +" wrong" ;
			falsecount++;
			}
			count++;
		}
		long endTime = System.currentTimeMillis();
		int testTime = (int)((endTime - startTime)/1000);
		
		System.out.println("You give " +correctcount+" right answer and "+falsecount+" false answer.");
		System.out.println("Your test time is "+testTime+ " seconds.");
		System.out.println(output);

		
		
		
	}

}


