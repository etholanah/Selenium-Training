package practice;

public class Car {
	
	Car(){
		System.out.println("Creating Constructor for Car Class ");
	}
	//Final method cannot be over ridden n a child class (see on BMW class)
	public final void setWheels() {
		System.out.println("Only 4 wheels are allowed");
	}

	String name = "Car Segment";
	
	public void run() {
		System.out.println("Car is Running");
	}
}

	