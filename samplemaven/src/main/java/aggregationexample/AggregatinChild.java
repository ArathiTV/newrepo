package aggregationexample;

public class AggregatinChild {

	public static void main(String[] args) {
		AggregationParent aggregationParent = new AggregationParent(" Arathi ",24);
		AggregatinChild aggregatinChild = new AggregatinChild(21," kannur ",aggregationParent );
		aggregatinChild.display();
		

	}
	int rollnumber;
	String city;
	AggregationParent obj; //Aggregation
	
	public AggregatinChild(int rollnumber,String city,AggregationParent obj) {
		this.rollnumber=rollnumber;
		this.city=city;
		this.obj=obj;
	}
	public void display() {
		System.out.println("rollnumber : " + rollnumber+ "\n"+" city  : " + city);
		System.out.println("name : "+obj.name+"\n"+"Age : " + obj.age);
	}
}
