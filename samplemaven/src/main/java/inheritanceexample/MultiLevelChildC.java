package inheritanceexample;

public class MultiLevelChildC extends MultiLevelParentB {

	public static void main(String[] args) {
		
		MultiLevelChildC obj = new MultiLevelChildC();
		obj.display1();
		obj.display2();
		obj.display3();

	}
	public void display3() {
		System.out.println("This is the Child class");
	}

}
