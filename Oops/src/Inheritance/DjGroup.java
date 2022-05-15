package Inheritance;

class Company {
	int empId = 2;
	double salary = 21000;

	void Organization(int x, double y) {
		System.out.println("method1 one we are overloding the with method2 paratmeter are x,y=");

	}

	void Organization(int a, int b) {
		System.out.println("method1 one we are overloding the with method2 paraeter are a,b=");
	}

	Company(double c, int d) {
		this(10);
		System.out.println("constructor one we are overloding the with constructor paraeter are c,d=");
	}

	Company(int e) {

		System.out.println("constructor one we are overloding the with constructor paraeter are e=");
	}
}

class Employee extends Company {
	char login = 'A';
	int pass = 2000;

	Employee(double c1, int d1) {
		super(10.1, 11);

		System.out
				.println("	super(20.2,20constructor one we are overloding the with constructor paraeter are c1,d1=");
	}

	Employee(int e1) {
		this(1.1, 1);
		System.out.println("constructor one we are overloding the with constructor paraeter are e1=");
	}

	void Orgamsation1(char a1, int f) {
		System.out.println("method1 one we are overloding the with method2 paratmeter are a1,f=" + this.login);
		System.out.println("method1 one we are overloding the with method2 paratmeter are a1,f=" + this.pass);
		System.out.println("method1 one we are overloding the with method2 paratmeter are a1,f=");

	}

	void Orgamsation1(int g, int h) {
		this.login = login;
		this.pass = pass;

		System.out.println("method1 one we are overloding the with method2 paratmeter are g=" + g);
		System.out.println("method1 one we are overloding the with method2 paratmeter are h=" + h);
		System.out.println("global non static=" + this.login);
		System.out.println("non static globale=" + this.pass);
	}

}

public class DjGroup {

	public static void main(String[] args) {
		System.out.println("***Start the magic of program**");
		Employee x1 = new Employee(10, 10);
		x1.Orgamsation1('k', 7);
		x1.Orgamsation1(5, 8);

	}

}
