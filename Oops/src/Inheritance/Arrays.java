package Inheritance;

public class Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//	String[] fullname;
//	fullname=new String[5];
//	//or
//	String[] name =fullname;  /// or  
//	
//	name[0]="My";
//    name[1]="Name";
//    name[2]="is";
//    name[3]="dinesh";
//    name[4]="jadhav";
		String[] name={ "My", "Name", "is" ,"dinesh" ,"jadhav" };
    System.out.println(name[0]);
    System.out.println(name[1]);
    System.out.println(name[2]);
    System.out.println(name[3]);
    System.out.println(name[4]);
    System.out.println(name.length);
    System.out.println("**************************************");
    for(int i=0;i<name.length;i++) {
  
    System.out.println(name[i]);
 
	}
    System.out.println("*******************");
    for(String i:name)
    {
    	System.out.println(i);
    }
}

	public static int[] copyOf(int[] num2, int length) {
		// TODO Auto-generated method stub
		return null;
	}
}
