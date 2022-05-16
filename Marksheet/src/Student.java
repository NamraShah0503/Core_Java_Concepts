import java.util.*;
public class Student {
		
		String name;
		int maths;
		int chemistry;
		int physics;
		int total;
		float percentage;
		char grade;
	
	void getData() {
	
		Scanner scr= new Scanner(System.in);
		System.out.println("Enter the Name :");
		name = scr.next();
		System.out.println("Enter the Marks of Physics :");
		physics = scr.nextInt();
		System.out.println("Enter the Marks of Chemistry :");
		chemistry = scr.nextInt();
		System.out.println("Enter the Marks of Maths :");
		maths = scr.nextInt();
		
	}//get data
	
	void CalculateData() {
		
		total = (maths+physics+chemistry);
		percentage = (total)/3.0f;
		
		if(percentage>=90) {
			grade = 'A';
		}else if(percentage>=80) {
			grade = 'B';
		}
		else if(percentage>=60) {
			grade = 'C';
		}
		else if(percentage>=35) {
			grade = 'D';
		}
		else {
			grade = 'F';
		}
	}//calculate data
	
	void printData() {
		
		System.out.println("Name = " + name);
		System.out.println("Physics = " + physics);
		System.out.println("Chemistry = " + chemistry);
		System.out.println("Maths = " + maths);
		System.out.println("Total = " + total);
		System.out.println("Percentage = " + percentage);
		System.out.println("Grade = "+ grade);
		
	}
	
	public static void main(String args[]) {
		
		Student s1 = new Student();
		s1.getData();
		s1.CalculateData();
		s1.printData();
		
	}
	
	
	
}//main class
