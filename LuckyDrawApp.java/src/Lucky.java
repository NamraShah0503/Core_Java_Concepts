/*
 * royal lucky draw app 


in your app all users are signup and they get unique number when they signup 
signup -> 

1.
ram ram@gmail.com  [ 12345 ] 


max 10 users can signup 



1 ram    XX   12345
2 sita   XX   42345
3 ravan  XX   62345
4 laxman xx   45345
 


1.signup //10
2.spinTheWheel //n
3.Dashboard 
4.Winner 
5.LeaderBoard

2 
winner is sita :: 42345

[1000] //every user have 0 credits 


3.
1 ram    XX   12345	5000
2 sita   XX   42345	6000
3 ravan  XX   62345	0
4 laxman xx   45345	2000 



4.
Sita XX 42345 6000 


5.
1 sita   XX   42345	6000
2 ram    XX   12345	5000
3 laxman xx   45345	2000 
4 ravan  XX   62345	0


 */

import java.util.*;

public class Lucky {
	
	public static void main(String[] args) {
	
		Scanner scr = new Scanner(System.in);
		int choice,i=0;
	
		getData c[] = new getData[10];
		
		while(true) {
		System.out.println("1. Signup");
		System.out.println("2. List");
		System.out.println("3. Spin The Wheel");
		System.out.println("5. Exit");
		System.out.println("Enter your choice");
		choice = scr.nextInt();
		switch (choice) {
		case 1:
			if(i==10)
			{
				System.out.println("Customer Limit Reached....");
				break;

			}
			c[i]= new getData();
			c[i].signup();
			i++;
			break;
	
		case 2:
			for(int j=0;j<i;j++) {
				c[j].printDetails();
			}
			break;
			
		case 3:
			 int rnd = (int)(Math.random()*c.length);
			1
			c[rnd].credits +=1000;
			break;
			
		case 5:System.exit(0);	
	
			default:
			System.out.println("INVALID CHOICE");
			break;
		}
	}
  }
}

class getData {
	Scanner scr = new Scanner(System.in);
	String name , email;
	long uid;
	int credits ;

void signup() {
	System.out.println("Enter the Name:");
	name = scr.next();
	System.out.println("Enter the Email Address:");
	email = scr.next();
	uid = (long)(Math.random()*100000);
	credits = 0;
}

void printDetails() {
	System.out.println("---------------------");
	System.out.println("Name = "+name);
	System.out.println("Email Id = "+email);
	System.out.println("UID = "+uid);
	System.out.println("Credits = "+credits);
	}

}

