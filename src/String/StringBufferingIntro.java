package String;

public class StringBufferingIntro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String name = "Mary";
		name.concat("Jane");
		
		System.out.println(name);
		
		
		//Append method
		StringBuffer name1 = new StringBuffer("Mary");
		name1.append("Jane");
		System.out.println(name1);
		
		StringBuffer name2 = new StringBuffer ("Chloe");
		name2.append("jane");
		System.out.println(name2);
		
		//Insert method
		name1.insert(3,  "Thoms");
		System.out.println(name1);
		
		//Replace method
		name2.replace(1, 3, "Faith");
		System.out.println(name2);
		
		//Delete method
		StringBuffer name3 = new StringBuffer ("Tamar Jones");
		name3.delete(2, 5);
		System.out.println(name3);
		
		//Reverse Method
		name1.reverse();
		System.out.println(name1);
		
		
	}

}
