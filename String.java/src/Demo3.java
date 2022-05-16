// email format : XXX@XXX.XXX [ X can be anything from A-Z a-z 0-9]

import java.util.*;
public class Demo3 {

	Scanner scr = new Scanner(System.in);
	String d ;
	
	void getData() {
		System.out.println("Enter a string:");
		d = scr.nextLine();
	}
	
	void authenticate() {
		if(d.charAt(3) == '@') {
									if(d.charAt(7)=='.') {
										System.out.println("Authentication Successfully.....");
									}
									else {
										System.out.println("Format not verified.......");
									}
			
								}
		else {
			System.out.println("Format not verified.......");
			
		}
		
	}
	
	
	public static void main(String[] args) {
		Demo3 s = new Demo3();
		s.getData();
		s.authenticate();
	}
	
}//main class
