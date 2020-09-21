package String;

public class StringIntro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String name = "Mary Jane";
		String name1 ="Mary Jane";
		String name2 ="mary jane";
		
		
		String country = new String("South Africa");
		String country1 = new String("South Africa");
		
		System.out.println(name + country);
		
		//String Comparisons
		System.out.println(name.equals(name1));
		System.out.println(name.equalsIgnoreCase(name2));
		
		System.out.println(name==name1);
		System.out.println(country ==country1);
		
		//Concatenation
		String finalString = name + name1 + name2;
		System.out.println(finalString);
		
		String secString =name.concat(name1).concat(name2);
		System.out.println(secString);
		
	}

}
