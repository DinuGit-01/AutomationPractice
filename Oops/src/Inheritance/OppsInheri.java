package Inheritance;


class A{
	int a1=22;
	static double y=22.22;
	A(){
		//this(10);
		this.a1=a1;
		
		System.out.println("this is the parent class==" +this.a1);
		System.out.println("this is the parent class");
		System.out.println(a1);
	}
	
}
class B extends A{
	int a =200;
	double s=20.5;
	B(int x){
		
		System.out.println("this is the class B have child of Class B");
		System.out.println("this is the class B have child of Class B="+x);
	}
}class C extends A{
	int d=300;
	char f='A';
	C(double a,int b){
		System.out.println("finally Class C is the child of the parent A");
	}
}

public class OppsInheri {

	public static void main(String[] args) {
		
		System.out.println("access the globale variable statics" +A.y);
		A x1=new A();
		System.out.println("access the globale variable statics=" +x1.a1);
		C x2 =new C(20.2,12);
		System.out.println("access the globale variable statics=" +x2.y);
		System.out.println("access the globale variable statics=" +x2.y);
		System.out.println("access the globale variable statics=" +x2.d);
		System.out.println("access the globale variable statics=" +x2.a1);
		System.out.println("access the globale variable statics=" +x2.f);
		System.out.println("access the globale variable statics=" +x2.f);
	}

}
