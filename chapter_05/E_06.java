package chapters.chapter_05;

// Multiplication table
public class E_06 {

	public static void main(String[] args) {
		System.out.println("\t\tMultiplication table");
		System.out.println();
		System.out.print("  ");
		for (int i = 1; i < 10; i++) {
			System.out.print("    " + i);
		}
		System.out.println("\n------------------------------------------------");
		for (int i = 1; i < 10; i++) {
			System.out.print("\n" + i + "|");
			for (int j = 1; j < 10; j++) {
				System.out.printf("%5d", i * j);

			}
			System.out.println();
		}

	}
}

