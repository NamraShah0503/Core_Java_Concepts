 /*take email and password from user and authenticate user.
valid email and password list 
1)  admin@royal.com  ,  admin123 
2)  royal@royal.com  ,  royal@secret
*/


import java.util.*;
public class StringDemo2 {

	int flag1 = 0;
	int flag2 = 0;
	String email ;
	String pass;
	String email1 = "admin@royal.com";
	String email2 = "royal@royal.com";
	String pass1 = "admin123";
	String pass2 = "royal@secret";

	void getData() {	
	Scanner scr = new Scanner(System.in);
	System.out.println("Enter email:");
	email = scr.next();
	System.out.println("Enter password :");
	pass = scr.next();
	System.out.println("Authentication Successful.........");

	}	
	
	void authenticate() {
		if(email.equalsIgnoreCase(email1)  && pass.equals(pass1) ) {
			flag1 = 1;
		}
		
		if(email.equalsIgnoreCase(email2) && pass.equals(pass2)) {
			flag2 = 1;
		}
	}		
		void check(){
		if (flag1 == 1 || flag2 == 1) {
			System.out.println("User Login Successful.......");		
		}
		else {
			System.out.println("User not identified........");
		}	
	}
	
	public static void main(String[] args) {
		
		StringDemo2 s = new StringDemo2();
		s.getData();
		s.authenticate();
		s.check();
	}
	
}//main class
