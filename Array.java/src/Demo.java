import java.util.*;
public class Demo {

	//	int b[] = new int [5];
	
	public static void main(String[] args) {
	
		Scanner scr = new Scanner(System.in);
		
		int a[] = new int [5];
		int i,b;
		int flag =0;

		for(i=0;i<a.length;i++) {
		System.out.println("Enter any element");
		a[i] = scr.nextInt();
	}
	
		System.out.println("The Entered Array is:");
		for(i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
		
		
	System.out.println("Enter the element you want to find:");
	b = scr.nextInt();
	
	for(i=0;i<a.length;i++) {
		if(b == a[i]) {
			System.out.println("Element "+b+ " found at "+ (i+1)+"th  position");
			flag = 1;
		}
	}
	
//		else {
//			flag = 0 ;
//		}
		if (flag == 1) {
			System.out.println("Present...");
		}
		else {
			System.out.println("Not Present....");
	}
		
		
	}//main
	
	
}//demo
