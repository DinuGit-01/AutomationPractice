package Inheritance;


abstract class GrandFather{
	abstract void method1();
	
	
	void method3(int age1,int age2)
	{
	System.out.println(    age2 +"**** print  the method3***"+age1 );
}

}


 class Father extends GrandFather{
	void method4() {
		System.out.println("method4 is the non parameterised");
		
	}
	
	void method5( int age3) {
		System.out.println("method4 is the non parameterised age3");
		
	}

	//@override
	void method1() {
	
}
 

 }

public class Contract {


	public static  void main(String[] args) {
		// TODO Auto-generated method stub
	
		
		 
		 GrandFather x1 = new Father();
		 x1.method1();
		 x1.method3(10,10);
	}

}
