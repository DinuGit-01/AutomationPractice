package Inheritance;


class Upcasting{
	void Mango() {
		System.out.println("******upcasting******");
	}
}

class downcasting extends Upcasting{
	int winde(int x) {
		System.out.println(" ");
		return x;
	}
	
	
}






public class Casting {

	public static void main(String[] args) {
		downcasting x1 =new downcasting();
		Upcasting x2=new downcasting();//upcasting implicitly
		Upcasting x3=x1;
		x1.Mango();
		x1.winde(10);
		
		
		
		// TODO Auto-generated method stub
		int a = 150;
		int b = a;// we can implicitly windening and auto wind the casting type
		int c = 20;
		double f = 100.00165521524545212;
		double d = (double) c;// we can also windening explicitly

		System.out.println("implicitly widening=" + b);
		short e = (short) a;
		float g = (float) f;
		int h = (int) g;
		System.out.println("implicitly widening=" + e);
		System.out.println("only explicitly narrowing is possible=" + g);
		System.out.println("explicitly widening possible=" + h);
	}

}
