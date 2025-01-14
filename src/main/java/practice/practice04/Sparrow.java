package practice.practice04;

public class Sparrow extends Animal {
	private boolean canFly;

	public Sparrow(String name, int age, boolean canFly) {
		super(name, age);
		this.canFly = canFly;
	}

	public boolean isCanFly() {
		return true;
	}

	public void setCanFly(boolean canFly) {
		this.canFly = canFly;
	}

	public void showInfo() {
		super.showInfo();
		if (canFly) {
			System.out.println("飛べます");
		} else {
			System.out.println("飛べません");
		}
	}

	public void cry() {
		System.out.println("鳴き声：チュンチュン");
	}
}
