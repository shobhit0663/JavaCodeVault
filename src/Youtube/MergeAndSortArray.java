// Package declaration (optional, used for organizing classes in the project)
package Youtube;

// Import necessary classes
import java.util.Arrays;  // Import Arrays utility class for sorting
 // Import everything from java.util (not needed here, but doesn't cause an issue)

public class MergeAndSortArray {  // Class declaration
    public static void main(String[] args) {  // Main method - Entry point of the program

        // Define two integer arrays with predefined values
        int array1[] = {8, 34, 23, 11, 32};  
        int array2[] = {76, 34, 24, 121, 42};

        // Call the mergeSortArrays method to merge and sort the arrays
        int mergedArray[] = mergeSortArrays(array1, array2);

        // Print the sorted merged array
        System.out.println(Arrays.toString(mergedArray));  
    }

    // Method to merge two arrays and sort them
    public static int[] mergeSortArrays(int array1[], int array2[]) {
        int len1 = array1.length;  // Get the length of the first array
        int len2 = array2.length;  // Get the length of the second array

        // Create a new array to store merged elements with size = len1 + len2
        int mergedArray[] = new int[len1 + len2];

        // Copy elements from the first array to the merged array
        for (int i = 0; i < len1; i++) {
            mergedArray[i] = array1[i];
        }

        // Copy elements from the second array to the merged array, starting after the last index of array1
        for (int i = 0; i < len2; i++) {
            mergedArray[len1 + i] = array2[i];
        }

        // Sort the merged array in ascending order
        Arrays.sort(mergedArray);

        // Return the sorted merged array
        return mergedArray;
    }
}
