import java.util.*;
public class Bank {
	
	int count = 0;
	double accno;
	double accno1;
	double balance = 5000;
	Scanner scr = new Scanner(System.in);
	static int flag = 0;
	String email,email1,pass,pass1;
	static String userName;
	
	void signup() {
		System.out.println("Enter your email address:");
		email = scr.next();
		System.out.println("Enter your password :");
		pass = scr.next();
		accno = Math.random();
		System.out.println("Alloted Account No."+accno);
	}
	
	void login() {
//		int flag1 =0;
		while(true) {
		System.out.println("Enter your registered email address");
		email1 = scr.next();
		System.out.println("Enter your registered password (Case-Sensitive) :");
		pass1 = scr.next();
		if(email.equalsIgnoreCase(email1) && pass.equals(pass1)) {
			System.out.println("Login Successful........");
			System.out.println("ACCOUNT BALANCE : 5000 RS");
			flag = 1;
			break;
		}
		else {
			System.out.println("Invalid email address or password....try again");
		}
	}
}	
	
	void deposit() {
		double balance1;
		System.out.println("Enter the amount you want to enter:");
		balance1 = scr.nextInt(); 
		if(balance1<60) {
			System.out.println("Minimum amt. of 60 required per transaction....");
		
		}
		else {
			balance = balance + balance1;
			 count++;
		
		}
	}
	 
	 void withdraw() {
		 double balance2  ; 
		 System.out.println("Enter the amount you want to deduct:");
		 balance2 = scr.nextInt(); 
		 if(balance-balance2<5000) {
			 System.out.println("Minimum amount of 5000rs is required....Deduction failed");
		 }
		 else if(balance2>15000){
			 System.out.println("You can not withdraw amount more than 15000 rs per transaction");
		 }
		 else {
			 balance = balance - balance2; 
			 count++;
		 }
	 }
	
	 void checkBalance() {
		 System.out.println("Your available balance is:  RS  "+balance);
	 }
	 
	 void count() {
		 			
//		 	count++;
			if(count>5) {
				System.out.println("Your limit of 5 transactions exceeded....Fixed bank charge of Rs 50 + 18% GST is deducted from your account");
				balance = (balance - 59);
				System.out.println("Your Remaining balance is:"+balance);
				
			}
			
	 }
	 void display()
	 {
		 System.out.println("Total transactions are:"+count);	 
	 }
	 
	 void transaction(){
		 double balance3;
		 System.out.println("Enter the Account number you want to transfer money with:");
		 accno1 = scr.nextInt();
		 if(accno == accno1) {
			 System.out.println("Enter the amount yo want to deduct:");
			 balance3 = scr.nextInt();
			 if(balance3>20000) {
				 System.out.println("Maximum Amount of 20000 can be transferred.... ");
			 }
			 else {
				 System.out.println("hi....");
			 }
		 }
		 else {
			 System.out.println("Account no. not found....");
		 }
	 }
	 
	 
	public static void main(String[] args) {
		Scanner scr = new Scanner(System.in);
		
		int choice,choice1;
		Bank b = new Bank();
		Bank c = new Bank();
		
		System.out.println("Enter the Name of user: ");
		userName = scr.next();
		if(userName == "Namra") {
		
		while(true) {
		System.out.println("\n1.Signup\n2. Login \n3.Exit");
		System.out.println("Enter your choice:");
		choice = scr.nextInt();
		switch (choice) {
		
		case 1:
			b.signup();	
			break;
			
		case 2:
			int i;
			b.login();
			if(flag == 1) {
				while(true) {
				System.out.println(" \n1. Deposit\n 2. Withdrawal\n 3. Check Balance\n 4. Send Money \n5. Logout\n");
				System.out.println("Enter the task you want to perform");
				choice1 = scr.nextInt();
				switch (choice1) {
				
				case 1: 
					 b.deposit();
					 b.count();
					 break;
					
				case 2: 
					b.withdraw();
					b.count(); 
					break;
	
				case 3:
					b.checkBalance();
					break;
		
				case 4:
					b.transaction();
					break;
					
				case 5:
					System.out.println("Logged out......");
					b.display();
					System.exit(0);
				default:System.out.println("Invalid choice");
					break;
				}//switch2
			}//while
		}//flag	
			
			
			break;
					
		
		case 3: System.exit(0);	
		
		default:System.out.println("Invalid choice");
			break;
		}//switch1
	  }//while	
	 }//Namra
		else {
			
			while(true) {
				System.out.println("\n1.Signup\n2. Login \n3.Exit");
				System.out.println("Enter your choice:");
				choice = scr.nextInt();
				switch (choice) {
				
				case 1:
					c.signup();	
					break;
					
				case 2:
					int i;
					c.login();
					if(flag == 1) {
						while(true) {
						System.out.println(" \n1. Deposit\n 2. Withdrawal\n 3. Check Balance\n 4. Send Money \n5. Logout\n");
						System.out.println("Enter the task you want to perform");
						choice1 = scr.nextInt();
						switch (choice1) {
						
						case 1: 
							 c.deposit();
							 c.count();
							 break;
							
						case 2: 
							c.withdraw();
							c.count(); 
							break;
			
						case 3:
							c.checkBalance();
							break;
				
						case 4:
							c.transaction();
							break;
							
						case 5:
							System.out.println("Logged out......");
							c.display();
							System.exit(0);
						default:System.out.println("Invalid choice");
							break;
						}//switch2
					}//while
				}//flag	
					
					
					break;
							
				
				case 3: System.exit(0);	
				
				default:System.out.println("Invalid choice");
					break;
				}//switch1
			  }//while	
			 }//Anyother User
		
	}//main

}// bank
