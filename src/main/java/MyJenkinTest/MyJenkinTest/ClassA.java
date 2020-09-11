package MyJenkinTest.MyJenkinTest;

abstract public class ClassA {
	private int x;

	private int y;

	ClassA(int x, int y) {
		this.x = x;

		this.y = y;
	}

	abstract public void show();

	public void addition() {
		System.out.println("Sum is" + (x + y));
	}
}