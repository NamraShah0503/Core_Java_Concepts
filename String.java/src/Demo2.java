/*
 	2) take 1 string and print it in reverse.
 */
import java.util.*;
public class Demo2 {
	
	Scanner scr = new Scanner(System.in);
	String d ;
	int a;
	String x = " ";
	
	void getData() {
		System.out.println("Enter a string:");
		d = scr.next();
		a = d.length();
	}
	
//	void rev() {
//		
//		String x[] = d.split("");
//		int i;	
//		for(i=a-1;i>=0;i--) {
//		System.out.println(x[i]);
//			}
//
//	}		

	void rev1(){
		int i;
		for(i=a-1;i>=0;i--) {		
			 x =  x + d.charAt(i);
				}
		System.out.println("Reversed String ="+x);
		
	}
	
	
		
	
	public static void main(String[] args) {
		Demo2 s = new Demo2();
		s.getData();
		s.rev1();
	}
	
	
}//main class
