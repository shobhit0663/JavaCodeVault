package Basics_Java;

public class SumOddNumbers {
	public static void main (String [] args) {
		int sum = 0;
		for (int i = 1; i <= 100; i += 2) { 
	        sum += i;
	    }

	    System.out.println("Sum of all odd numbers from 1 to 100 is: " + sum);
	}
	
}
