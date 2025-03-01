package Basics_Java;
import java.util.HashSet;
public class FindDuplicatesElementsInArray {
					public static void main(String [] args) {
						int arr[] = {1,1,23,3,3,234,21,23,12};
						HashSet<Integer> set = new HashSet<>();
						
						System.out.println("Dulpicates: ");
						
						for(int num : arr) {
							if(!set.add(num)) {
								System.out.print(num + " ");
							}
						}
					}
}
