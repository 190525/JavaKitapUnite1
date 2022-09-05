package chapters.chapter_05;

// Finding Prime number
public class E_11 {

	public static void main(String[] args) {
		final int NUMBER_OF_PRIMES = 50;
		int count = 0;
		int number = 2;

		while (count < NUMBER_OF_PRIMES) {
			boolean isPrime = true;
			for (int i = 2; i < number; i++) {
				if (number % i == 0) {
					isPrime = false;
					break;
				}
			}
			if (isPrime == true) {
				count++;
				System.out.printf("%5d", number);
				if (count % 10 == 0) {
					System.out.println();
				}

			}
			number++;

		}

	}

}

