package sample;

public class Sample2 {

	public static void main(String[] args) {
		//型変換（キャスト）について
		//小さいものを大きい型の箱に入れる場合は勝手にキャストされる
		double testNum = 10;
		System.out.println(testNum);

		int testInt = (int) testNum;

		String name = "正原";
		String name2 = "裕二";

		System.out.println(name + name2);
	}

}
