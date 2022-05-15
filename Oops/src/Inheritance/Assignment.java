package Inheritance;

class Jadhav {
	void reverse() {
		int n1 = 123, rev = 0, rem = 0;
		while (n1 != 0) {
			rem = n1 % 10; // Armstrong number = 153-> 1*1*1+ 5*5*5* + 3*3*3*= 1+125+27 -> 153
			rev = rev * 10 + rem; // rev= rev+rem*rem*rem;
			n1 = n1 / 10;

		}

		System.out.println(rev);
	}

	double Method1(int x) {

		System.out.println("method have parameter is double");
		return 10;

	}

	double Method1(int z, int y) {
		System.out.println(" print the method2 ");
		return 10;
	}
}

class Number1 extends Jadhav {
	void palindrome() {
		int n1 = 121, rev = 0, rem = 0;
		int temp = n1;
		while (n1 != 0) {
			rem = n1 % 10; // 1, 2, 1/10=0.1, 1
			rev = rev * 10 + rem; // 1, 12 , 121
			n1 = n1 / 10; // 12, 1

		}
		if (temp == rev) {
			System.out.println(" Number is Palindrome.");
		} else {
			System.out.println(" Number is not Palindrome");
		}
	}

	double Method1(int y) {
		// @ Overriding
		super.Method1(12);
		System.out.println(" print the method2 " + y);
		return 10;
	}

	double Method1(int z, int y) {
		// @ overriding
		super.Method1(z, y);
		System.out.println(" print the method2 ");
		return 10;
	}

	Number1(double a, int b) {
		System.out.println(" call the cunstructor and overloading=1");// 1
	}

	Number1() {
		this(11.2, 10);
		System.out.println(" call the cunstructor overloading=2");// 2
	}
}

class Number2 extends Number1 {

	void lipYear(int year) {

		if (year % 4 == 0 && year != 100 || year % 400 == 0) {

			System.out.println("leap year");
		} else {
			System.out.println("Non This Year");
		}

	}

}

public class Assignment {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Number2 obj1 = new Number2();
		obj1.lipYear(2022);
		Number1 obj = new Number1();
		obj.Method1(20);
		obj.palindrome();
		Jadhav z1 = new Jadhav();
		z1.reverse();

	}

}
