import java.util.*;
public class Const {

	public static void main(String[] args) {
		
		Child c = new Child(2);
	}
	
}// cons


class Parent {
	
	 Parent() {
		 this(2);
		System.out.println("Parent()");
	}
	
	Parent(int a) {	
	System.out.println("Parent(int)");
		
	}
}//parent




class Child extends Parent{
	
	 Child() {
		 super();
		System.out.println("Child()");
	}
	
	 Child(int a) {
		 this();
		System.out.println("Child(int)");
	}
}//child

