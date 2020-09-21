package practice;

public class childAddition extends MethodOverloading{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		MethodOverloading add = new MethodOverloading();
		add.addValues(11, 11);
		add.addValues(11, 11, 11);
		
		add.addValues(22,  22);
		
		double d = add.addValues(11.11, 22.22);
		System.out.println(d);
	}

}
