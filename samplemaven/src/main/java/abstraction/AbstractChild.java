package abstraction;

public class AbstractChild extends Abstractparent {	

	public static void main(String[] args) {
		AbstractChild abstractChild = new AbstractChild();
		abstractChild.add();
		abstractChild.display();
		abstractChild.show();
	}

	@Override
	public void add() {
		int c = 5 + 6;
		System.out.println(c);

	}

	public void show() {
		System.out.println("child class");
	}
}
