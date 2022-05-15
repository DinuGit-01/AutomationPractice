package DefaultClasses;

class Object1 {

	private int m = 10;
	private double n = 155.007;

	public double  gettermethods(int m, double n) {
		System.out.println(" my name is jadhav");
		return 2555.16;

	}
}

public class DefaultObjectClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Object1 x = new Object1();
		x.gettermethods(12, 15.2);
		System.out.println("  my name is khan" + x.gettermethods(10000, 125.21));
		System.out.println(x);
System.out.println(x.hashCode());
System.out.println(x.toString());
System.out.println(x.getClass());
	}

}
