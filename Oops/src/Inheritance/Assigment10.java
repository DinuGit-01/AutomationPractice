package Inheritance;

class Number {

	void reverse() {
		System.out.println(" method1 reverse");
	}

	void palindrome() {
		System.out.println(" method2 palidrome");
	}

	void leapyear() {
		System.out.println(" method2 leapyear");
	}

	void leapyear(int x) {
		
		System.out.println(" leapyear method is overloaded");
	}
 Number(int z){
	 this();
	 System.out.println(" call the constructor");
	 
 }
 Number(){
	 System.out.println(" ********************");
 }
	class square extends Number {
		square(int y){
			super(10);
			System.out.println(" access the anather class");
		}
	void reverse() {
			super.reverse();
			System.out.println("  method1 is override");
		}
		
		void palindrome() {
			super.palindrome();
			System.out.println("  method2 is override");
		}
		
		void leapyear() {
			super.leapyear();
			System.out.println("  method3 is override");
		}

	}

	public class Assigment10 {

		public  void main(String[] args) {
			square a1 = new square(10);
			square k = new square(8);
			a1.reverse();
			a1.palindrome();
			a1.leapyear(10);
		}

	}
}
