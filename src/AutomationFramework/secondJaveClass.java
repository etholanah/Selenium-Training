package AutomationFramework;

public class secondJaveClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str1= "Hello";
		String str2= "Team";
		
		System.out.println(str1 + " " + str2);
		
		int A = 200;
		int B = 300;
		
		System.out.println(A + B);
		
		System.out.println(A + B + str1 + str2);
		//output will be 500HelloTeam
		
		System.out.println(str1 + str2 +A + B);
		//Output will be HelloTeam200300 
		//it assumes that the whole thing is a string since the beginning was a string and wont add the integers
	
		if (A>B){
			System.out.println("A is bigger than B");
		}
			else if(A<B) { 
				System.out.println("A is smaller than B");
			}
			else if (A == B ) {
		System.out.println("A is the same as B");
			}
			else {
				System.out.println("We have no Value");
			}
	}
	
}



