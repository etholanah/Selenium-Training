package practice;

public class Circle extends Shape{



	@Override
	public void displayShape() {
		// TODO Auto-generated method stub
		
		System.out.println("Shape is Circle");
	}
	
	public static void main(String[] args) {
		
		Shape s = new Circle();
		Shape s1 = new Triangle();
	}

}
