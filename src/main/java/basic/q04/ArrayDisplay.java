package basic.q04;

public class ArrayDisplay {

	public static void main(String[] args) {
		String[] arrayFruit = new String[5];
		arrayFruit[0] = "りんご";
		arrayFruit[1] = "ばなな";
		arrayFruit[2] = "みかん";
		arrayFruit[3] = "ぶどう";
		arrayFruit[4] = "すいか";

		for (String fruit : arrayFruit) {
			System.out.println(fruit);
		}

		//		String[] arrayFruit2 = { "りんご", "ばなな", "みかん", "ぶどう", "すいか" };
		//		for (String fruit : arrayFruit2) {
		//			System.out.println(fruit);
		//		}

	}

}
