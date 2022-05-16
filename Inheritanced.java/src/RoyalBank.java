import java.util.*;
public class RoyalBank {

	Scanner scr = new Scanner(System.in);
	String email;
	String email1 = "namra.shah@gmail.com";
	String pass;
	String pass1 = "namra2002";
	int flag=0;
	int balance ;
	
	
	void login() {
	
		System.out.println("Enter your Email id:");
		email = scr.next();
		System.out.println("Enter your Password:");
		pass = scr.next();
		
		if(email.equalsIgnoreCase(email1) && pass.equals(pass1)) {
			System.out.println("Login Successful.....");
			flag =1;
			
			while(true) {
			System.out.println("Enter the amount you want to pay as the beginning balance:");
			balance = scr.nextInt();
			if(balance>=5000) {
					System.out.println("Account Created Successfully  ...");
				}
			else {
					System.out.println("Minimum account balance must be 5000rs...");
				}
			}
		}
			
		else{
			System.out.println(" Wrong email id or password....Retry Again....");
		}
	}
	//login
	
	void deposit() {
		
	}
	
	public static void main(String[] args) {
		

	}
	
	
}// royalbank
