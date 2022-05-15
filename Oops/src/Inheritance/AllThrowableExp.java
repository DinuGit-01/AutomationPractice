package Inheritance;

import java.util.Scanner;

public class AllThrowableExp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		int d= 15/0;
//		System.out.println(" it throw the arethematicexception"+d);
//		int[] s=new int[3];
//		s[3]=100;
//	System.out.println(" it throw the Arrayoutofbondindex"+s);
//		String d1=null;
//		System.out.println(d1.length());

		int x, y, z;
		Scanner x1 = new Scanner(System.in);
		try {
			// int a = 10 / 0;
			System.out.println("enter the x num");
			x = x1.nextInt();
			System.out.println("enter the y num");
			y = x1.nextInt();
			z = x / y;

		} catch (ArithmeticException e) {
			System.out.println("please execute the catch block" + e);
			System.out.println(" i am here to handle the exception");
			e.printStackTrace();
			e.getMessage();

		}
		try {
			System.out.println("Inside the try block");
			// below code throws divide by zero exception
			int data = 25 / 2;
			// System.exit(0);
			System.out.println(data);
		}
		// cannot handle Arithmetic type exception
		// can only accept Null Pointer type exception
		catch (NullPointerException e) {
			System.out.println(e);
		}
		// executes regardless of exception occured or not
		finally {
			System.out.println("I am inside finally block");
			// int k=10/0;
			System.out.println("finally block is always executed");
		}

	}
}
