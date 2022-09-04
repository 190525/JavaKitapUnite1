package chapters.chapter_05;
// Sentinel value
import java.util.*;
public class E_04 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		
		int sum=0;
		int number=-1;
		while(number!=0) {
			System.out.println("Enter a number to sum(enter 0 to finish)");
			number=input.nextInt();
			sum+=number;
		}
		System.out.println("The result of summation is "+sum);
		

	}

}


