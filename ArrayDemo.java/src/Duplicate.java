import java.util.*;
public class Duplicate {

	Scanner scr = new Scanner(System.in);
	
	int a[] = new int[10];
	
	void Scan() {
		
		for(int i=0;i<a.length;i++) {
			System.out.println("Enter "+ i+"th element: ");
			a[i] = scr.nextInt();
		}
	}
	
	
	void print() {
		System.out.println("Elements in array:");
		for(int i=0 ; i<a.length;i++) {	
			for(int j=0;j<i;j++) {
				int flag = 0;
				
				if(a[i]==a[j]) {
					flag =0;
				}
				else {
					flag = 1;
				}
				if(flag==1) {
					System.out.println(a[i]);
					}
				
		}
	}	
}
	
	
	public static void main(String[] args) {
		
		Duplicate d = new Duplicate();
		d.Scan();
		d.print();
	}
}// class