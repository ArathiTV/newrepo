package superkeyword;

public class SuperVariableChild2 extends SuperVariableParentExm2 {

	public static void main(String[] args) {
		SuperVariableChild2 obj1 = new SuperVariableChild2();
		obj1.show();
	}
   public void show() {
	   System.out.println("this is the child class");
	   super.display();
   }
}
