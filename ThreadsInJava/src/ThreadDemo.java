import java.util.*;
public class ThreadDemo {

	public static void main(String[] args) {
	
}
	
	class copy extends Thread {
		void copypaste() {
			for(int i=0;i<15;i++) {
				System.out.println("copy"+i);
			}
			}
		public void run() {
			copypaste();
		}
	
	}
	class paste extends Thread {
		void printData() {
			for(int i=0;i<15;i++) {
				System.out.println("copy"+i);
			}
			}
		public void run() {
			printData();
		}
	
}//
}//class threadDemo