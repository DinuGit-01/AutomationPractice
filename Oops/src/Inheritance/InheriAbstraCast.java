package Inheritance;

class InHeritance {
	InHeritance() {
		this(10);
		System.out.println(" I am the consstructor of the this class");
	}

	InHeritance(int c) {
		System.out.println(" i am passing value c=");
	}

	int a = 15;
	double b = 15.5;

	void methodover() {
		System.out.println(" emty method");
	}

}

class InHeritance1 extends InHeritance {

	InHeritance1() {
		super();
		System.out.println("i am chain the constructor of sub class");

	}

	InHeritance1(double d) {
		this();
		System.out.println(d);

	}

}

abstract class InHeritance3 {
	InHeritance3() {
		System.out.println(" i am the constructor of the absract class i can access");
	}

	int e = 15;
	double f = 1500.00;

	int Abmethod(int e) {
		System.out.println("name are same so you can use the this keyword");
		return 10;
	}

	abstract void Abamethod();

}

class InHeritance4 extends InHeritance3 {
	// overiding abstract method we are given the bofy to abs
	void Abamethod() {
		System.out.println(" I am the part of the abstract because i am overided");

	}

	InHeritance4(double g) {
		super();
		System.out.println("doiuble value= " + g);
	}
}

interface InHeritance5 {
	int h = 11; // 100% abstract and public static final keyword are defaultly

	void $method(); // public abstract -->defualtly
}

interface InHeritance6 {
	
	void _method(double i);

	char methodd();
}

class InHeritance7 implements InHeritance5, InHeritance6 {
	public void $method() {
        
		System.out.println(" In interface we req to write public for overriding");
	}

	public void _method(double i) {
		System.out.println(" In interface we req to write public for overriding" + i);
	}

	public char methodd() {
		System.out.println('A');
		return 'A';
	}
}

public class InheriAbstraCast {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InHeritance7 a1=new InHeritance7();
		a1.$method();
		a1._method(10);
		a1.methodd();
		System.out.println(InHeritance5.h);
		InHeritance4 b1= new InHeritance4(2.00);
		b1.Abamethod();
	}

}
