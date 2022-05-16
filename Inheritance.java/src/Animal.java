//  Inheritance
 class Animal {
	void four_legs() {
		System.out.println("It has 4 legs....");
		}
	
	
	public static void main(String[] args) {
		
//		Dog d1 = new Dog();
//		d1.four_legs();
//		d1.barks();
//		Cat c1 = new Cat();
//		c1.four_legs();
//		c1.mews();
		Babydog b1 = new Babydog();
		b1.four_legs();
		b1.barks();
		b1.weeping();
		
	}//main 
	
 } // Animal class
class Dog extends Animal{
	void barks() {
		System.out.println("Barking.......");
	}
}//dog

class Cat extends Animal{
	void mews() {
		System.out.println("Mewing.......");
	}
}//cat

class Babydog extends Dog {
	void weeping() {
		System.out.println("Weeping......");
	}
	
}//Babydog

