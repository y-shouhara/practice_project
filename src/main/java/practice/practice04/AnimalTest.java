package practice.practice04;

public class AnimalTest {

	public static void main(String[] args) {
		Dog dog = new Dog("ポチ", 2, "白");
		dog.ShowInfo();
		dog.cry();

		System.out.println("------------------------");

		Sparrow sparrow = new Sparrow("チュン", 1, true);
		sparrow.showInfo();
		sparrow.cry();
	}

}
