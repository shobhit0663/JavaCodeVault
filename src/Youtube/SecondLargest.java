package Youtube;

public class SecondLargest {

	public static void main(String[] args) {
		int array[]= {54,54,23,52,24,55,65}; 
		int secondLargest = findSecondLargest(array);
		System.out.println(secondLargest);
	}
	
	public static int findSecondLargest (int[] array){
		int largest = Integer.MIN_VALUE;
		int secondLargest = Integer.MIN_VALUE;
		
		for(int i=0;i<array.length;i++) {
			int num = array[i];
			if(largest<num) {
				secondLargest = largest;
				largest = num ;
			}
		}
		return secondLargest;
	}

}
