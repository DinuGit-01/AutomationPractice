package Inheritance;

interface India {

	int a = 20;// public static final

	void dinesh(); // public abstract

	void dinesh1(int x);
}

interface Bharat {
	double a = 20;

	double country(int a);
}

class State implements India, Bharat {
	public void dinesh() {
		int x = 10;
		System.out.println(" please provoid the body to thento dinesh");
		System.out.println(x);
	}

	public void dinesh1(int x) {
		System.out.println("vlaue of petrol=" + x);

	}

	public double country(int a) {
		System.out.println(" if you dont override all the above abstract method then and then contract is completed");
		return 100;
	}

	State() {
		System.out.println(" constructor on in class ");
	}

	State(int w) {
		this();
		System.out.println(" constructor overloading");
	}
}

class Maharashtra extends State {
	double pune(double k) {
		super.dinesh1(15);
		System.out.println("here is the class inheritetd");
		return (113.7);
	}

	Maharashtra() {
		super(10);
		System.out.println(" this maharashra constructor");

	}
}

abstract class Solapur {
	int g = 15;

	abstract void Mohol();

	void gotewadi(double i) {
		System.out.println(i);

	}
}

class Taluka extends Solapur {
	// @ overiding
	void Mohol() {
		super.gotewadi(12000.0);
		double pop = 15555.01;
		System.out.println(" we provoid the body to absract method");
		System.out.println(pop);

	}
}

public class Nation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(" print final variable" + India.a);
		System.out.println(" print final variable" + Bharat.a);
		State obj = new State();
		obj.dinesh();
		obj.dinesh1(12);
		obj.country(112);
		Bharat a1 = new State();
		a1.country(12);
		India a2 = new State();
		a2.dinesh();
		Maharashtra k1 = new Maharashtra();
		k1.pune(12.2);
		Maharashtra d1 = new Maharashtra();
		Taluka g1 = new Taluka();
		g1.Mohol();

	}

}
