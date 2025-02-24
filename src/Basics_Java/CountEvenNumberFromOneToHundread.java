package Basics_Java;

public class CountEvenNumberFromOneToHundread {
		 public static void main (String [] args) {
			 

			 String s = "";
			 String res = "";
			 
			 for(int i=s.length()-1;i>=0;i--) {
				 res += s.charAt(i);
			 }
			 
			 if(s.equals(res)) {
				 System.out.println(s + " is a palindrome...");
			 }
			 else {
				 System.out.println(s + " is not a palindrome...");
			 }
			 
			
			 
			 for(int i=1;i<=4;i++) {
				 for(int j=4;j>=i;j--) {
					 System.out.print(" ");
				 }
				 for(int k=1;k<=i;k++) {
					 System.out.print(" *");
				 }
				 System.out.println();
			 }
			 
			// reversed string
			 String str  = "Shobhit Gaidhane";
			 String re = "";
			 for(int i=str.length()-1;i>=0;i--) {
				 re += str.charAt(i);
			 }
			 System.out.println("Reversed String is " + re);
			 int sum = 0;
			 for(int i=1;i<=100;i+=2) {
				 sum += i;
			 }
			 System.out.println("Total sum of Even Numbers From 1 to 100 = " + sum);
			 
			 
		 }
		 
}

	
    