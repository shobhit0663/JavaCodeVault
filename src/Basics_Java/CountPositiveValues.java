package Basics_Java;

public class CountPositiveValues {
 public static void main (String [] args) {

int data[]={3,5,-2,-7,8,5,4};
int flag = 0;
	for (int i = 0; i<data.length;i++){
		if(data[i]>=0){
			flag++;
		}
		
	} 
	System.out.println(flag);
	
		// Type your code below
		
	}
}

