package Youtube;

public class SumOfAllElementsInAnArray {
    public static void main(String[] args) {
        int numbers[] = {4,5,4,7,4,3,7,5,6};
        int sum = calculateSum(numbers); // Call the method and store the result
        System.out.println("Sum of all elements: " + sum);
    }

    public static int calculateSum(int[] array) { // Change return type to int
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum; // Return the calculated sum
    }
}
