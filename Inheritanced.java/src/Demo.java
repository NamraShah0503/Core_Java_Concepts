/*
 * Task:-> 
	Royal techno soft P ltd , has two types of employee 
	fulltime and parttime employee.
	you need to design app to calculate payment of all the employees.
	all employee have their firstname and email in system. 
	fulltime employee will get salary and monthly bonus
	parttime employee will get monthlyPayCheck on basis of totalHours works and 
	they get 5% of bonus if totalHours of work > 200. 
	
	1) design class , identify variable and methods. 	
	2) implement logic for both employees 
-----------------------------------------------------------------------------------
 */
import java.util.*;

public class Demo {

	Scanner scr = new Scanner(System.in);
	String firstName;
	String email;
	double salary = 10000;
	double bonus = (salary * 0.05);
	double totalSal = (salary + bonus);
	
	int perHourRate;
	int totalHours;
	double pcal;
	double ptcal;
	double bonus1;

	public static void main(String[] args) {
		 int choice;
		Scanner sc = new Scanner(System.in);

		System.out.println("1. Full Time");
		System.out.println("2. Part Time");
		System.out.println("Enter Employee Job Status");
		choice = sc.nextInt();
		if (choice == 1) {
			FullTime f = new FullTime();
			f.getData();
			f.calculate();	
		}

		if (choice == 2) {
			PartTime p = new PartTime();
			p.getData();
			p.calculate();
		}

	}//main

}//demo

class RoyalTech extends Demo {

	void getData() {
		System.out.println("Enter your Name:");
		firstName = scr.nextLine();
		System.out.println("Enter your Email Address:");
		email = scr.next();
	}

}

class FullTime extends RoyalTech {

	void calculate() {
		System.out.println("The salary of Full Time Employee is:" + salary);
		System.out.println("Bonus 5%  = " + bonus);
		System.out.println("The  Final salary with Bonus is:" + totalSal);
	
	}

}// fulltime

class PartTime extends RoyalTech {

	void calculate() {
		System.out.println("Enter the Per hour Amount rate for the employee");
		perHourRate = scr.nextInt();
		System.out.println("Enter the Number of hours an Employee has worked");
		totalHours = scr.nextInt();
		pcal = (perHourRate * totalHours);
		ptcal = pcal + bonus1;

		if (totalHours > 200) {
			bonus1 = (pcal * 0.05);
			ptcal = (pcal+bonus1);
			System.out.println("The Salary for " + totalHours + " is " + pcal);
			System.out.println("Bonus 5% = " + bonus1);
			System.out.println("The total Amount obtained for working " + totalHours + " is " + ptcal);
		} else {
			System.out.println("The Salary for " + totalHours + " is " + pcal);
		}

	}// calculate

}// parttime