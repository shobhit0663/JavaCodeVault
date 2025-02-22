package Basics_Java;

public class RemoveWhiteSpaces {
	public static void main (String [] args) {
		
		String str = "Welcome to java Programming";
		System.out.println("Before Removing the white spaces :" + str);
		str = str.replaceAll("\\s", "");
		System.out.println("After Removing the white spaces :" + str);
	}
}
