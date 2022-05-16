	/*
	 * Cricket App:-	
		 players registration ,like  firstname  , age , batsman or bowler 
		 if player is batsman then ask for totalRuns and inningsplayed
		 if player is bowler then ask for totalWickets and inningsplayed 
		 rules:-
		 	players age must be >= 18 and <= 30
		 	default skill is batsman 
		 	
	 */
import java.util.*;
public class CricketApp {

	Scanner scr = new Scanner(System.in);
	String firstName;
	int age;
	String category;
	int totalRuns;
	double inningsplayed;
	int totalWickets;
	static int choice =1;
	
	void getData() {
		
		System.out.println("Enter the Age of cricketer:");
		age = scr.nextInt();
		
		if(age >= 18 && age <= 30) {
			System.out.println("Enter the Name of Cricketer:");
			firstName = scr.next();
		}
		else {
			System.out.println("Age limit not matched.....");
			System.exit(0);
		}
	}//getData
	

	void batsman() {
		System.out.println("Enter total runs scored by batsman :");
		totalRuns = scr.nextInt();
		System.out.println("Enter total innings played by batsman :");
		inningsplayed =  scr.nextDouble();
	}
	
	void bowler() {
		System.out.println("Enter total wickets taken by bowler :");
		totalWickets = scr.nextInt();
		System.out.println("Enter total innings played by bowler :");
		inningsplayed =  scr.nextDouble();
	}
	
	void putData() {
		System.out.println("Name = "+firstName);
		System.out.println("Age = "+age);
		if(choice == 1) {
			category = "Batsman";
			System.out.println("Player's Category = "+category);
			System.out.println("Runs Scored = "+totalRuns);
			System.out.println("Innings Played = "+inningsplayed);
		}
		if(choice == 2) {
			category = "Bowler";
			System.out.println("Player's Category = "+category);
			System.out.println("Wickets taken = "+totalWickets);
			System.out.println("Innings Played = "+inningsplayed);
		}
		
	}
	
	public static void main(String[] args) {
		
		Scanner scr = new Scanner(System.in);
		
		
		System.out.println("Enter the category of the player:");
		System.out.println("1. Default----------Batsman");
		System.out.println("2. User-Defined-----Bowler");
		
		choice = scr.nextInt();
//		while(true) {
		switch (choice) {
		
		case 1:
			CricketApp p = new CricketApp();
			p.getData();
			p.batsman();
			System.out.println("----------------------------Player's Data---------------------------");
			System.out.println("  ");
			p.putData();
			break;
			
		case 2:
			CricketApp p1 = new CricketApp();
			p1.getData();
			p1.bowler();
			System.out.println("----------------------------Player's Data---------------------------");
			System.out.println("  ");
			p1.putData();
			break;			
			
		default:System.out.println("INVALID CHOICE");
			break;
		}
//	  }	
	}	//main	
}//class
	
	


