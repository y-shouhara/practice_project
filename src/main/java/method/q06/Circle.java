package method.q06;

public class Circle {

	public static void main(String[] args) {
		double length = 5.0;
		double area = getCircleArea(length);

		System.out.println("半径：" + length);
		System.out.println("円の面積：" + area);
	}

	private static double getCircleArea(double length) {
		return Math.pow(length, 2) * 3.14;
	}

}
