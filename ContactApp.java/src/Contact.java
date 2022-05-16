import java.util.*;
public class Contact {

	Scanner scr = new Scanner(System.in);
	int i=0;
	
	String name;
	double contactNo;
	String city;
	
	void addContact() {
		
		System.out.println("Enter the name of Contact:");
		name = scr.next();
		System.out.println("Enter the Number of Contact:");
		contactNo = scr.nextDouble();
		System.out.println("Enter the City of Contact:");
		city = scr.next();
	}
	
	void listContacts() {
		System.out.println("Name ---------Contact No------------City");
		System.out.println(name+"---------"+contactNo+"------------"+city);
		
	}
	
	
	public static void main(String[] args) {
		
		Scanner scr = new Scanner(System.in);
		int a[] = new int [5];
		int choice;
		Contact b = new Contact();
		
		while(true) {
		System.out.println("1. Add Contact");
		System.out.println("2. List Contacts");
		System.out.println("3. Exit");
		choice = scr.nextInt();
		
		switch (choice) {
		case 1:
			a[i] =  new addContact();
			a[i].add
			i++;
			break;

		case 2 :
			b.listContacts();
			break;
			
		case 3:
			System.exit(0);
			
		default:System.out.println("INVALID CHOICE");
			break;
		}
		
		}//while
	}
}
