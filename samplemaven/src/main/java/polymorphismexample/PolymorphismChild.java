package polymorphismexample;

public class PolymorphismChild extends PolymorphismParent {

	public static void main(String[] args) {
		PolymorphismChild polymorphismChild = new PolymorphismChild();
		polymorphismChild.add(5,6);	
		polymorphismChild.substact(10, 5);
	}
	
	@Override
	public void add(int a, int v) {
		
		super.add(a +1, v +6);
		int c = a+v;
		System.out.println(c);
		
	}
	
	
	

}
