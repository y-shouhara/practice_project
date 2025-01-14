package method.q09;

public class Even {

	public static void main(String[] args) {
		int num = 5;
		boolean checkNum = checkEven(num);

		if (checkNum) {
			System.out.println(num + "は偶数です。");
		} else {
			System.out.println(num + "は奇数です。");
		}
	}

	private static boolean checkEven(int num) {
		boolean checkNum;
		if (num % 2 == 0) {
			checkNum = true;
		} else {
			checkNum = false;
		}
		return checkNum;
	}

}
