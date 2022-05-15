package Inheritance;

interface Plannet {

	int p = 25;

	void jupiter();

}

class Sun implements Plannet {
	// @ overriding the 100% absraction
	private int s = 17;

	public void jupiter() {
		System.out.println(" I the body  absract method");
	}

	public void gettingmethod() {
		System.out.println("************");
	}

	void fire() {
		System.out.println(" sun is fire the heat");

	}

	int Hot(int x) {

		System.out.println("valu of int is =" + x);
		return x;
	}

}

class Earth extends Sun {
	// @ ovrerriding
	void fire() {
		this.fire(10, 'a');
		System.out.println(" only earth class method is acceess");

	}

	void fire(int a, char y) {
		System.out.println(" i am dharti maa==" + a);
	}

}

class Moon extends Earth {
	void fire(int x, char y) {
		System.out.println(" value is from the Moon class");
	}
}

public class Manyforms {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("*******simple inheritance***");
		Earth abj = new Earth();
		Moon x1 = new Moon();// I required only one object memery in runtime polymorphism
		Earth x2 = (Earth) new Moon();
		Sun x3 = (Sun) new Moon();
		abj.fire();
		Sun a1 = (Sun) new Earth();// or up casting is implicitly
		Sun a2 = a1; // up casting implicitely
		abj.fire();
		abj.Hot(20000);
		abj.fire(10, 'A');
		x1.fire();
		x1.fire(22000, 's');
		x1.Hot(250000);
		x1.jupiter();
System.out.println(" access the privete variable" + x1.p);

		System.out.println("runtime polymorphism class  inherited, upcasting and overridinng");

	}

}
