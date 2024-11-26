package acsessmodifier;

public class AcessModifierExample1 {

	public static void main(String[] args) {
		AcessModifierExample1 obj = new AcessModifierExample1();
		obj.display();
		obj.display1();
		obj.display2();
		obj.display3();

	}
	public void display() {
		System.out.println("This is the public method");
	}
	private void display1() {
		System.out.println("This is the private method");
	}
	protected void display2() {
		System.out.println("This is the protected method");
	}
	void display3() {
		System.out.println("This is the default method");
	}
}
