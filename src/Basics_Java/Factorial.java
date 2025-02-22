package Basics_Java;
import java.util.*;
import java.io.*;
public class Factorial {

	public static void main(String[] args){
		int n = 4 ;
		int fact = 1;
		for (int i =1;i<=n;i++) {
			fact = fact * i ;
		}
		System.out.println(fact);
		
	}
}