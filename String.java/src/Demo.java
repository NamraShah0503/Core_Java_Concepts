/*
	1) take 1 string from user and count searchWord from user , searchWord is string given by user.
*/

import java.util.*;
public class Demo {

	String d;
	String e;
	int count=0;
	int a;
	Scanner scr = new Scanner(System.in);

	void getData() {
		System.out.println("Enter a string:");
		d = scr.nextLine();
		System.out.println("Enter a String You want to search :");
		e = scr.next();
		a = d.length();
	}
	void find() {
			if(d.contains(e)==true) {
				System.out.println("Entered string is present.....");
			}
			else {
				System.out.println("Entered string is not present.....");
			}
	
	}
	
	void calculate() {
		String x[] = d.split(" ");
		int i;
		for(i=0;i<x.length;i++) {
			if(x[i].equals(e)) {
				count++;
			}
		}
	System.out.println(e +" found for " +count+" time(s)");
	}
	
	
	public static void main(String[] args) {
		Demo s1 = new Demo();
		s1.getData();
		s1.find();
		s1.calculate();
	}
}// main class
