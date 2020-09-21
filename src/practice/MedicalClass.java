package practice;

public class MedicalClass implements Student{

	@Override
	public void displayName() {
		// TODO Auto-generated method stub
		System.out.println("Hi, we are from Medical Department");
	}

	@Override
	public void getStudentNumber() {
		// TODO Auto-generated method stub
		System.out.println("We are 140 Students");
		
	}

	@Override
	public void getStandard() {
		// TODO Auto-generated method stub
		System.out.println("We are from MBBS");
	}
	
	public void getUniversity() {
		System.out.println("University name is London University");	
	}
	
	public static void main(String[] args) {
		EngineeringClass eng = new EngineeringClass();
		MedicalClass med = new MedicalClass();
		
		eng.displayName();
		eng.getStandard();
		eng.getStudentNumber();
		eng.getUninersity();
		
		System.out.println("**************************************");
		
		med.displayName();
		med.getStandard();
		med.getStudentNumber();
		med.getUniversity();
	}

	@Override
	public void getInterfaceName() {
		// TODO Auto-generated method stub
		
	}

}
