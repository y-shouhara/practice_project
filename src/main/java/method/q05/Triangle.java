package method.q05;

public class Triangle {

	public static void main(String[] args) {
		int length = 8;
		int height = 5;
		int area = getTriangleArea(length, height);

		System.out.println("底辺：" + length);
		System.out.println("高さ：" + height);
		System.out.println("三角形の面積：" + area);
	}

	private static int getTriangleArea(int length, int height) {
		return length * height / 2;
	}

}
