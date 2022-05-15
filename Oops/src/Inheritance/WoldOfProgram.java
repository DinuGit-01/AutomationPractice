package Inheritance;

class Testing {
	int unit = 1;
	double code = 2;

	// @constrcutor overloading
	Testing() {
		System.out.println(" I am the constrcutor present in the parent and sub class");
	}

	Testing(int a) {
		this.integration(10, 12.12);
		System.out.println(" we need to write the default constructor first in the parrnt class");
	}

	double integration(int unit, double code) {
		System.out.println(" i am unit and cod level Testing");
		System.out.println(" regration of the after unit and code");
		double res = unit + code;
		return res;
	}
}

class Manual extends Testing {
	// this the getter methods
	private String str = "programming";

	public String gettingmehod() {
		return " data ";
	}

	String line = "I am the manual and automation testing";

	void main(String[] args) {
		System.out.println(" count of the string" + line.length());

	}

	Manual() {
		super(10);
		System.out.println(" we need the constructor chaining for the same default constructor");
	}

}

interface Automation {
	String value = "constant";// this are the public static final value

	void absractmethod();// this is the 100% absraction or this method always public absract
}

class partial implements Automation {
	// @ overriding
	public void absractmethod() {

		System.out.println("I am body of the 100% absract method above");
	}

}

public class WoldOfProgram {

	public static void main(String[] args) {

		String S2 = new String("dinesh");
		String S3 = "dinesh Jadhav";
		String s4 = "Dinesh";

		Manual S1 = new Manual();
		System.out.println("Access the program= " + S1.gettingmehod());
		partial a1 = new partial();

		a1.absractmethod();
		System.out.println(" value of the string is=" + a1.value);
		System.out.println(a1);
		System.out.println(" integer valus of the tostring code=" + a1.hashCode());
		System.out.println("I am the part the string".length());// 24
		System.out.println(" total lenth od the string=" + S3.length());// 6
		System.out.println("concat " + S2.concat(s4));
		System.out.println("equality=" + S2.equals(s4));
		String str = "     i am a software tester         ";
		String[] str1 = str.split(" ", 4);
		for (String s : str1) {
			System.out.println(s);
		}
		System.out.println(" trim, the string=" + str.trim());
		System.out.println(" trim, the string=" + str.length());
		System.out.println(" trim, the string=" + str.trim().length());

	}
}
