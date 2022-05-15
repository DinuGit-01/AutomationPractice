package Inheritance;
import java.util.Scanner;
public class ArrayAssigment {

	public static void main(String[] args) {
		int myage;
		double mysalary;
		boolean valid;
		char element;
		Scanner data=new Scanner(System.in);
		System.out.println("enter thr value of the int value");
		myage=data.nextInt();
		System.out.println("enter thr value of the double value");
		mysalary=data.nextDouble();
		System.out.println("enter thr value of the valid false or true");
		valid=data.hasNext();
		System.out.println("character value");
		element=data.next().charAt(0);
		int num1;
		int num2;
		double res;
		System.out.println("  enet the first valuse");
		num1=data.nextInt();
		System.out.println("  enet thes second value");
	num2=data.nextInt();
	char op;
	op = data.next().charAt(0);
		System.out.println("addition="+addNumber(op,num1,num2));
	}
		static int addNumber(char op, int num1, int num2) {
			if (op == '+') {
				return num1 + num2;
			} else {
				return 0;
			
}
	}
}