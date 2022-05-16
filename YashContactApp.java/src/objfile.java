
import java.util.*;
import java.io.*;
import java.io.FileInputStream;
import java.io.FileOutputStream;


public class objfile  implements Serializable{
	
	public static void main(String args[]) throws IOException, ClassNotFoundException{
		Scanner scr = new Scanner(System.in);
		a3 a = new a3();
		File f = new File("users.txt");
		f.createNewFile();
		FileOutputStream fos = new FileOutputStream(f);
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		int n =3;
		for(int i=0;i<n;i++)
		{
			a.get();
			oos.writeObject(a);
		}
		oos.close();
		
		FileInputStream fis = new FileInputStream(f);
		ObjectInputStream ois = new ObjectInputStream(fis);

		

	
		for(int i=0;i<n;i++)
		{
			a = (a3) ois.readObject();
			a.show();
			
		}
		
	}

}

class a3   implements Serializable{
	int no;
	String name;
	Scanner scr = new Scanner(System.in);
	void get()
	{
		System.out.println("enter ur no");
		no= scr.nextInt();
		System.out.println("enter ur name");
		name = scr.next();
	}
	void show()
	{
		System.out.println(" ur no :"+no);
		System.out.println(" ur name"+name);


	}
	
}