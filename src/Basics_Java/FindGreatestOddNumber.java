package Basics_Java;

public class FindGreatestOddNumber {
		
			
			    public static void main(String[] args) {
			        int[] numbers = {12, 45, 7, 68, 99, 22, 31}; // Sample array

			        int maxOdd = Integer.MIN_VALUE; // Initialize with the smallest possible value

			        for (int num : numbers) {
			            if (num % 2 != 0 && num > maxOdd) { // Check if the number is odd and greater than current maxOdd
			                maxOdd = num;
			            }
			        }

			        if (maxOdd == Integer.MIN_VALUE) {
			            System.out.println("No odd numbers found.");
			        } else {
			            System.out.println("Greatest odd number: " + maxOdd);
			        }
			    }
			

		
}
