package Inheritance;

class SecretVariables {
	private int x = 1500;
	private double y = 45000;

	public int getmethod() {
		System.out.println(" this is the getter method=" + x);
		return x;
	}

	public double getmethod1() {
		System.out.println(" this is also getter method");
		return y;
	}

	public void setmethod(int x) {
		System.out.println(" update the value of variable="+x);
	}

	public void setmethod(double y) {
		System.out.println("update the double variable ="+y);
	}
}

public class GetSetMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 SecretVariables a1=new  SecretVariables ();
	 System.out.println(" access the private variable by using getter method=" + a1.getmethod());
	 System.out.println(" access the private variable by using getter method=" + a1.getmethod1());
	 a1.setmethod(12);
	 a1. setmethod(4500); 
	 SecretVariables a2=new  SecretVariables ();
	 System.out.println(" access the private variable by using getter method=" + a1.getmethod());
	 System.out.println(" access the private variable by using getter method=" + a1.getmethod1());
}

}
