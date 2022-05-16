import java.util.*;
public class Demo {

	String name;
	String city;
	String no;
	
	Scanner scr = new Scanner(System.in);
	
	
	void getData() {
	System.out.println("Enter your Name:");
	name = scr.next();
	System.out.println("Enter your Mobile Number:");
	no = scr.next();
	System.out.println("Enter your City:");
	city = scr.next();
	}
	
	
	void putData() {
		System.out.println("Name :"+name+"\tContact Number :"+no+"\tCity :"+city);
//		System.out.println();
//		System.out.println();
	}
	
	
	
	public static void main(String[] args) {
		int i = 1,choice;
		Scanner scr = new Scanner(System.in);
		Demo c[] = new Demo[2];
		while(true) {
		System.out.println("1. Add Contact");
		System.out.println("2. Display ");
		System.out.println("3. Exit");
		System.out.println("Enter your Choice:");
		choice = scr.nextInt();
	
		switch (choice) {
		case 1:
			if(i>3) {
				System.out.println("you can enter max 2 contacts.....");
			}else {
				
				for(i=1;i<=3;i++) {
					c[i]= new Demo();
					c[i].getData();
					i++;
				}	
			}//exit
			break;

		case 2:
			if(i<1) {
				System.out.println("Empty List.......");
			}
			else {
			for(i=1;i<=3;i++) {
				c[i].putData();
			}
			}	
			break;
		case 3:System.exit(0);
		default:System.out.println("Invalid Choice....");
			break;
		}
		
		
	
		
		
		}//while
		
	}//main
	
}//demo
