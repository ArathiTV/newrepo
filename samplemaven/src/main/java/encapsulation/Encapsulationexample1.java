package encapsulation;

public class Encapsulationexample1 {
	private String name;
	private int rollNumber;
	
	public void setter(String name,int Age) {
		this.name = name;
		this.rollNumber =rollNumber;
	}
	
	public void getter() {
		System.out.println(name+rollNumber);

	}
}
