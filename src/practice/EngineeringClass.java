package practice;

public class EngineeringClass implements Student{

	@Override
	public void displayName() {
		// TODO Auto-generated method stub
		System.out.println("Hi, we are from Engineering");
		
	}

	@Override
	public void getStudentNumber() {
		// TODO Auto-generated method stub
		System.out.println("We are 120 Students");
	}

	@Override
	public void getStandard() {
		// TODO Auto-generated method stub
		System.out.println("We are from Computer Science");
	}

	public void getUninersity() {
		System.out.println("University name is: " + Student.university);
		
	}

	@Override
	public void getInterfaceName() {
		// TODO Auto-generated method stub
		
	}
}
