
//package javaroyal;
import java.util.*;
public class contact {
	
public static void main(String args[])
{
		Scanner scr = new Scanner(System.in);

		contact_app c[] ;
				
		c = new contact_app[5];
	
		int ch,i=0;
		String n;
		char temp,g;
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
					if(i==6)
					{
						System.out.println("u only add 5 contact:");
						break;
		
					}
					c[i]= new contact_app();
					c[i].addno();
					i++;
				break;
				case 2:
					for(int j=0;j<i;j++)
					c[j].display();
				break;
				case 3:
					System.exit(0);
				break;
				case 4:
				
					
						System.out.println("enter name u want to search :");
						n = scr.next();
		
							for(int k=0;k<i;k++)
							{
								if(n.equalsIgnoreCase(c[k].name))
								{
									c[k].display();	
									break;
								}
								
							}
							
							
						
				break;
				case 5:
					System.out.println("enter char u want to search :");
					n = scr.next();
		
						for(int k=0;k<i;k++)
						{ 
							if((c[k].name.startsWith(n.toUpperCase()) ) || (c[k].name.startsWith(n.toLowerCase())))
							{
								c[k].display();	
								
							}
							
						}		
				break;
				case 6:
//					temp = 'a';
//					for(int j =0 ;j<26;j++)
//					{
//						for(int k=0;k<i;k++)
//						{ 
//								
//								g = c[k].name.charAt(0);
//								if(temp == g )
//								{
//									c[k].display();
//								}
//								
//						}
//						++temp;
//						
//					}
					
			contact_app tem = null;
			for(int j=0;j<i-1;j++)
			{
				for(int k=0;k<i-1;k++)
				{
					if(c[j].name.compareTo(c[j+1].name) > 0)
					{
						tem = c[j];
						c[j] = c[j+1];
						c[j+1] = tem;
					}
				}
						
			}
		
				
			for(int j=0;j<i;j++)
				c[j].display();		
					
					
				break;
				
				case 7:
					System.out.println("enter ur name want to delete :");
					n = scr.next();
		
					contact_app l= null;
					for(int j=0;j<i;j++)
					{

							if(n.equals(c[j].name) )
							{
								for(int r=j;r<i-1;r++)
								{
									l = c[j];
									c[j] = c[j+1];
									c[j+1] = l;
								}
								
							}
							
								
					}
					i--;
					
				break;
				
			
					
			}
		
		
		
		}



		
		
		}

	private static String charAt(String name) {
		// TODO Auto-generated method stub
		return null;
	}
}



class contact_app
{
	String name,city;
	String  no;
	Scanner scr = new Scanner(System.in);
	void addno()
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