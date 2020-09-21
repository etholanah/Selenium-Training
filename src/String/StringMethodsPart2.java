package String;

public class StringMethodsPart2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String text1 = "TechTraining";
		String text2 = "TechTraining";
		String text3 = "techtraining";
		
		//String equals() method
		System.out.println(text1.equals(text2));
		System.out.println(text1.equals(text3)); // equals is case sentitive
		
		System.out.println(text1.equalsIgnoreCase(text3));
		
		//String indexOf() method
		System.out.println(text1.indexOf("h"));
		//returns the index of a given character
		
		
		//String lastIndexOf
		System.out.println(text1.lastIndexOf("T"));
		
		//String length() method
		System.out.println(text1.length());
		
	}

}
