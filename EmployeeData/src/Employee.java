import java.util.Scanner;

public class Employee{
	
		int eid;
		String name;
		int salary;
		
		void scan() {
			
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the employee id:");
			eid = sc.nextInt();
			sc.nextLine();
			System.out.println("Enter the name:");
			name = sc.nextLine();
			System.out.println("Enter the salary:");
			salary = sc.nextInt(); 
		}
	
		void display() {
			
			System.out.println(eid + " " + name +" " +salary);
			
			}
		
		
		 public static void main(String args[]) {
			 
			 Employee e1 = new Employee();
			 Employee e2 = new Employee();
			 Employee e3 = new Employee();
					
				
			 e1.scan();	
			 e2.scan();	
			 e3.scan();	
					
			 e1.display();
			 e2.display();
			 e3.display();
				
			 
		 }
		
		
}