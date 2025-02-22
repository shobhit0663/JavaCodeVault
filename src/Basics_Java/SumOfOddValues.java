package Basics_Java;

public class SumOfOddValues {

	public static void main(String[] args) {
		int data[]= {3,5,7,9 };
		int flag = 0;
		for(int i=0;i<data.length;i++){
			if(data[i]%2!=0){
				flag = data[i]+flag;
			}
		}
		System.out.println(flag);
			// Type your code below
			
		}
	

	}


