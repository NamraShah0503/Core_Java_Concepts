/*
 Task:1)  Create class Car having two variable , name of the car and average of car. 
		  you must have to take care, 
		  		no default value will assign by java 
		  		default value for all car name must be -> 'punch' and average must be '15'
		  		
		  		you can also provide facility to override the value of average and car name. 
		  		
		  		also create printData() , that prints all the value of car. 
		  		
 */
import java.util.*;
public class Car {
	
		Scanner scr = new Scanner(System.in);
		String name;
		int avg;
		
	Car(){
		name = "punch";
		avg = 15;		
	}
	
	Car(String n , int a){
		System.out.println("Enter the name of the car:");
		n = scr.next();
		name = n ;
		System.out.println("Enter the average of the car:");
		a = scr.nextInt();
		avg = a;
	}
	
	
	void printData() {
		System.out.println("Name of Car = "+name);
		System.out.println("Average of Car = "+avg);

	}
	public static void main(String[] args) {
		
		Scanner scr = new Scanner(System.in);
		int choice;
		
		System.out.println("1. Default value");
		System.out.println("2. User Defined");
		System.out.println("Enter your choice:");
		choice = scr.nextInt();
		switch (choice) {
		
		case 1:
			Car c = new Car();
			c.printData();	
			break;

		case 2:
			Car c1 = new Car("Punch",15);
			c1.printData();	
			break;
			
			default:
				System.out.println("Invalid Choice");
				break;
		}
//		
//		Car c = new Car("Punch",15);
//		c.printData();	
//		
		
	}
}
