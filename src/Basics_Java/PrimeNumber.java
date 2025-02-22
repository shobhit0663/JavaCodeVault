package Basics_Java;
public class PrimeNumber {
	
	public static void main(String [] args) {
		
		//Step  1
		int num = 23;
		boolean isPrime = true;
		// Step 2
		if(num <= 1) {
			isPrime = false;
		}
		else {
			for(int i=2;i<=Math.sqrt(num);i++) {
				if(num % i == 0) {
					isPrime = false;
					break;
				}
			}
		}
		
		// Step 3
		if (isPrime) {
			System.out.println(num + " is a prime number....");
		}
		else 
		{
			System.out.println(num + " is not a prime number....");
		}
	}
	
}
