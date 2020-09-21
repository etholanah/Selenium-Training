package practice;

abstract class Shape {

	//ABSTRACT METHOD (it has no body)
	abstract public  void displayShape();

	//Non-Abstract method (it has a body - the one in {}
	public void displayName() {
		System.out.println("From Shape class");
	}
}

