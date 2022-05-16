import java.util.*;
public class threadDemo {

	
	public static void main(String[] args) {
	
		ThreadSum th = new ThreadSum();
		Thread s1 = new Thread(th);
		Thread s2 = new Thread(th);
		
		s1.start();
//		s2.start();
	
		
		
	}
}


class ThreadSum extends Thread{
	

	static int sum =0;
	
	synchronized void sum1(int a,int b) {
		for(int i=a;i<=b;i++) {
			sum = sum+i;
		}
	}
	
//	synchronized void sum2(int c , int d) {
//			for(int i=c;i<=d;i++) {
//				sum = sum+i;
//			}
//	}	
	
	
	public void run() {
		sum1(1,50);
//		sum1(51,100);
		System.out.println("Sum ="+sum);
	}
	
	
	
}




