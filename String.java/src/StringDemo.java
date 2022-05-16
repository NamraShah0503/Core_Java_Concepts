import java.util.Scanner;;
public class StringDemo {
	String name;
	
	void getData() {	
	Scanner scr = new Scanner(System.in);
	System.out.println("Enter a String:");
	name = scr.nextLine();
	}	
	
	
	void ifVowel() {
		int i;
		int count =0;
			for(i=0; i<name.length();i++) {
										if(name.charAt(i) == 'A' || name.charAt(i) == 'E' || name.charAt(i) == 'I' || name.charAt(i) == 'O' || name.charAt(i) == 'U' || name.charAt(i) == 'a' ||name.charAt(i) == 'e' ||name.charAt(i) == 'i' ||name.charAt(i) == 'o' ||name.charAt(i) == 'u' ) {
											count++;
										}
										
		}
			System.out.println("Total vowels = "+count);
	}
	
	public static void main(String[] args) {
		StringDemo s = new StringDemo();
		s.getData();
		s.ifVowel();
	}
}//main class

