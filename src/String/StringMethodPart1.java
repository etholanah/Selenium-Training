package String;

public class StringMethodPart1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//String charAt() Function
		String text = "Learning is the key";
		
		char ch = text.charAt(12);
		
		System.out.println(text.charAt(5));
		System.out.println(ch);
		
		//String concat() Function	
		String text2 =text.concat(" to success").concat(" and we are learning Java");
		System.out.println(text2);
		
		//String contains() method
		System.out.println(text.contains("key"));
		
		//String endsWith() method
		System.out.println("Message ends with key: " + text.endsWith("key"));
		
	}

}
