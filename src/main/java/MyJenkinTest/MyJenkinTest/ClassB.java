package MyJenkinTest.MyJenkinTest;

public class ClassB extends ClassA {

	ClassB(int x, int y) {

		super(x, y);

	}

	@Override
	public void show() {
		System.out.println("calling show method.");

	}

	public static void main(String[] args) {
		ClassA test = new ClassB(10, 20);

		test.addition();

		test.show();

	}
}
