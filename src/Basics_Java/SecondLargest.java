package Basics_Java;
import java.util.Scanner;

public class SecondLargest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int n = sc.nextInt();
        
        int data[] = new int[n];  
        
        System.out.println("Enter " + n + " numbers:");
        for (int i = 0; i < n; i++) {
            data[i] = sc.nextInt();
        }
        
        int largest = data[0]; 
        for (int i = 1; i < data.length; i++) { 
            if (data[i] > largest) {  
                largest = data[i];  
            }
        }
        
        System.out.println("Largest Number is: " + largest);
        sc.close();
    }
}
