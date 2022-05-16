import java.util.*;
public class Demo {

	public static void main(String[] args) {
		
		Scanner scr = new Scanner(System.in);
		int a,b,c;
		try {
			System.out.println("Enter 2 nos:");
		
			a = scr.nextInt();
			b = scr.nextInt();
			
			c = (a/b);
			System.out.println("Answer ="+c);
		}catch(ArithmeticException n){
			System.out.println("pls enter a Non-Zero number....");
		}catch(InputMismatchException e) {
			System.out.println("Enter a numeric value");
		}

		
	}
	
}//demo
