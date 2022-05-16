   
import java.util.*;
//package constructor;
public class DefaultConstructor {

	byte b;
	short s;
	char c;
	int i;
	long l;
	float f;
	double d;
	boolean bb;
	String name; // null
	Scanner scr; // null

 

	void display() {
		System.out.println(b);
		System.out.println(s);
		System.out.println(c);
		System.out.println(i);
		System.out.println(l);
		System.out.println(f);
		System.out.println(d);
		System.out.println(bb);
		System.out.println(name);

	}

	public static void main(String[] args) {
		DefaultConstructor d = new DefaultConstructor();// implicit default
		d.display();
		// cpp
		// DefaultValue dd;//default
		// dd.display(); //g.v
	}
}