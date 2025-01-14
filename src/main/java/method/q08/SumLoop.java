package method.q08;

public class SumLoop {

	public static void main(String[] args) {
		int minNum = 1;
		int maxNum = 100;
		int sumNum = sumLoop(minNum, maxNum);

		System.out.println("最小値：" + minNum);
		System.out.println("最大値：" + maxNum);
		System.out.println("加算結果：" + sumNum);
	}

	private static int sumLoop(int minNum, int maxNum) {
		int sumNum = 0;
		for (int i = minNum; i <= maxNum; i++) {
			sumNum += i;
		}
		return sumNum;
	}

}
