package Basics_Java;

public class Palindrome {
    public static void main(String[] args) {
        String str = "madam";
        int count=0;
         for (int i=0;i<str.length();i++) {
        	 if(str.charAt(i)==str.charAt(str.length()-1-i)) {
        		count++;
        	 }
         }
         
         if(count==str.length()) {
        	 System.out.println("palindrome");
         }
         else {
        	 System.out.println("not palindrome");
         }
         
        
        
        

    }
}
