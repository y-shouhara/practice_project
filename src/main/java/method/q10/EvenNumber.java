package method.q10;

import java.util.Arrays;

public class EvenNumber {

	public static void main(String[] args) {
		int[] arrayNum = { 3, 2, 5, 6, 7, 25, 10, 51, 88, 98 };
		int evenCount = getEvenNumbers(arrayNum);

		System.out.println(Arrays.toString(arrayNum) + "には、偶数が" + evenCount + "個あります。");
	}

	private static int getEvenNumbers(int[] arrayNum) {
		int evenCount = 0;
		for (int item : arrayNum) {
			if (item % 2 == 0) {
				evenCount += 1;
			}
		}
		return evenCount;
	}
}
