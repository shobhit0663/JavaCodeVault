package Basics_Java;

public class SwappNumber {

	public static void main (String [] args) {
		
		int a = 10;
		int b = 20;
		
		a = a + b;
		b = a-b;
		a = a - b ;
		
// using third variable 
//		int temp = a;
//		a = b;
//		b = temp;
		
		
		System.out.println(a);
		System.out.print(b);
		
	}
}
