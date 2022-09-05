package chapters.chapter_05;

//Converting Decimals to Hexadecimals
import java.util.*;

public class E_10 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number you want to hexadecimal");
		int number = input.nextInt();
		String hexString = "";
		while (number > 0) {
			int hexNumber = number % 16;
			if (hexNumber <= 9 && hexNumber >= 0) {
				hexString = String.valueOf(hexNumber) + hexString;

			} else {
				char hexChar = (char) (hexNumber - 10 + 'A');
				hexString = hexChar + hexString;

			}
			number = number / 16;

		}
		System.out.println("The hex number is " + hexString);

	}

}

