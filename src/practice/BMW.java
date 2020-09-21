package practice;

public class BMW extends Car{

	String name = "BMW";
	
	//Final method cannot be over ridden n a child class
	public void setWheels() {
	
	public void getName() {
		System.out.println(name);
		System.out.println(super.name);
	}
	
	public static void main(String[] agrs) {
		
		/*Car car =new Car();
		System.out.println(name);
		car.run(); */
		
		BMW bmw = new BMW();
		bmw.getName();
	}
}
