package basic.q07;

public class MultiplicationTable {

	public static void main(String[] args) {

		for (int r = 1; r <= 9; r++) {
			for (int c = 1; c <= 9; c++) {
				System.out.printf("%s%2d%s", "\t", r * c, "\t");
			}
			System.out.println("");
		}

	}

}
