package sample;

public class ForLoop {

	public static void main(String[] args) {
		int[] numArray = { 1, 2, 3 };
		for (int i = 0; i < numArray.length; i++) {
			System.out.println(numArray[i]);
		}
		for (int item : numArray) {
			System.out.println(item);
		}
	}

}
