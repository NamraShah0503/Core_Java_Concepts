
import java.util.*;

public class contacts {
	public static void main(String args[])
	{
		Scanner scr = new Scanner(System.in);
		con y[];
		y = new con[5];
		
		int ch,c=0;
		String n ;
		int f=1;
	
		while(true)
		{
			System.out.println("press 1 to add contact:");
			System.out.println("press 2 to display contact");
			System.out.println("press 3 to exit");
			System.out.println("press 4 to search name\n press 5 to search with char\n");
			ch = scr.nextInt();
			switch(ch)
			{
			case 1:
				if(c>=5)
				{
					System.out.println("u cannot enter contact");

				}
				y[c] = new con();
				c++;
			break;
			case 2:
				for(int i=0;i<c;i++)
				{
					y[i].display();
				}
			break;
			case 3:
				System.exit(0);
			break;
			case 4:
				System.out.println("enter ur name u want to search");
				 n = scr.next();
				 f=1;
				for(int i=0;i<c;i++)
				{
					if(n.equals(y[i].name))
					{
						f=0;
						y[i].display();
						break;
					}
					
					
				}
				
				if(f==1)
				System.out.println("name not found");
			break;
			case 5:
				System.out.println("enter ur char u want to search");
				 n = scr.next();
				 f=1;
				for(int i=0;i<c;i++)
				{
					if(n.startsWith(y[i].name))
					{
						f=0;
						y[i].display();
					}
					
					
				}
				
				if(f==1)
				System.out.println("name not found");
				
			break;
			
			
				

				
				

				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
			
			
			
			
			
			}
			
		
		
		
		}
		
		
		
	}

}


class con
{
	String name,city;
	String  no;
	Scanner scr = new Scanner(System.in);
	 con()
	{
		System.out.println("enter ur name");
		name = scr.next();
		System.out.println("enter ur city");
		city = scr.next();
		System.out.println("enter ur no");
		no = scr.next();
		
	}
	
	void display()
	{
		System.out.println("ur name :"+name);
		System.out.println("ur city:"+city);
		System.out.println("ur no:"+no);
	}
	
}