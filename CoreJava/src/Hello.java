import java.util.Scanner;

public class Hello {
			public static void main(String[] args) {
				int num1;int num2;int choice;
				Scanner sc=new Scanner(System.in);
				System.out.println("Enter Number FRIST ");
				num1=sc.nextInt();
				System.out.println("Enter Second Number ");
				num2=sc.nextInt();
			
				System.out.println("1. Addition");
				 System.out.println("2. Substraction");
				 System.out.println("3. Multiplication");
				 System.out.println("4. Division");
				 System.out.println("5. exit");
				 choice=sc.nextInt();	
			
				switch(choice) {
				
				case 1: 
					System.out.println("addition = " + (num1+num2));
					break;
				case 2: 
					System.out.println("substraction = " +(num1-num2));
					break;
				case 3: 
					
					System.out.println("multiplication = " +(num1*num2));
					break;
				case 4: 
					System.out.println("division = "+(num1/num2));
					break;
				case 5: 
					System.out.println(" EXIT ");
					
				default:System.out.println("Invalid input");	
				 }//switch
				}//while	
			}





