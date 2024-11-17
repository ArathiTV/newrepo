package abstraction;

public class AbstractExampleChild extends Abstractexample1Parent{

	public static void main(String[] args) {
		Abstractexample1Parent obj = new AbstractExampleChild ();
		obj.display();
		obj.show();
		obj.display1();
		
		
	}

	
		
	
	
	public void display1() {
		System.out.println("Display child");
	}

	@Override
	public void display() {
		System.out.println("Display");
		
	}
	
    
}
