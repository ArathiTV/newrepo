package superkeyword;

public class SuperVariableChild1 extends SuperVariablParentExm1 {
	String color = "Red";
	public static void main(String[] args) {
		SuperVariableChild1 obj = new SuperVariableChild1();
		obj.display();
	}
	public void display() {
		System.out.println(color);
		System.out.println(super.color);
	}
	
	

}
