package method.q04;

public class SumNumbers {

	public static void main(String[] args) {
		int num1 = 3;
		int num2 = 2;
		int sumNum = calculateSum(num1, num2);

		System.out.println("第一引数：" + num1);
		System.out.println("第二引数：" + num2);
		System.out.println("加算結果：" + sumNum);

	}

	private static int calculateSum(int num1, int num2) {
		return num1 + num2;
	}

}
