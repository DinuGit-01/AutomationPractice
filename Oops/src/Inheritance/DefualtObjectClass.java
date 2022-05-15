package Inheritance;

class Engineering {
	int a = 15;
	double b = 12.1515;

	void Engineer(int a) {
		System.out.println(a);
	}

	void Abhiyantrik() {
		System.out.println("** Mai hua Abhiyantrik**");
	}

}

class Mechanical extends Engineering {
	// @ override
	void Engineer(int a) {
		this.Engineer(10, 20);
		System.out.println(" I am mechanical egineer");
	}

	void Engineer(int b, int a) {
		int y = a + b;
		System.out.println(" addition=" + y);
	}

}

class Computer extends Engineering {
	// @ overriding
	void Engineer(int a) {
		this.Abhiyantrik();
		System.out.println(" I am software Engineer");
	}

}

public class DefualtObjectClass {

	public static void main(String[] args) {
		System.out.println("***********************************************************");
		Engineering E1 = new Engineering();
		E1.toString();
		System.out.println(" " + E1.toString());
		System.out.println(" " + E1.hashCode());
		System.out.println(" I am the primitive datatype variable Casting" + E1.a);
		short s = 10;
		int a = 15;
		double b = 12.1515;
		int c = (int) b;
		int d = (short) s;// or explicit widening..
		int x = s;// autoprimitive or implicity casting
		System.out.println(c);// explicitly Narrowing casting...
		System.out.println(s);

		// Engineering c1 = new Computer ();// upcasting is that we creat object of
		// subclass and ref to the parant class also polymo
		// or
		Engineering c1 = (Engineering) new Computer();// explicit casting up
		c1.Engineer(5);
		c1.Abhiyantrik();
		Mechanical q = new Mechanical();
		q.Engineer(50, 50);

		System.out.println("*********************************************************************");
		int[][] TOM = new int[3][3];// multiple Array
		System.out.println(" length of the array =" + TOM.length);
		for (int i = 0; i < TOM.length; i++) {
			for (int j = 0; j < TOM[i].length; j++) {
				System.out.print(" " + TOM[i][j]);

			}
			System.out.println();
		}
		TOM[0][0] = 1;
		TOM[0][1] = 2;
		TOM[0][2] = 3;
		TOM[1][0] = 4;
		TOM[1][1] = 5;
		TOM[1][2] = 6;
		TOM[2][0] = 7;
		TOM[2][1] = 8;
		TOM[2][2] = 9;
		System.out.println(" length of the array =" + TOM.length);
		for (int i = 0; i < TOM.length; i++) {
			for (int j = 0; j < TOM[i].length; j++) {
				System.out.print(" " + TOM[i][j]);

			}
			System.out.println();
		}

	}
}
