package Basics_Java;

public class CountOfEvenAndOddNumber {
		public static void main(String [] args) {
			int num = 22222;
			int even_count = 0;
			int odd_count = 0;
			
			while(num>0) {
				int rem = num % 10;
				if(num%2==0) {
					even_count ++;
				}
				else {
					odd_count ++;
				}
				num = num /10;
			}
			System.out.println("Even Number is " + even_count);
			System.out.println("Odd Number is " + odd_count);
			
	}
}
