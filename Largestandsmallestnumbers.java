package javaLearnings;

import java.util.Arrays;

public class Largestandsmallestnumbers {

	public static void main(String[] args) {
		int numbers[]={-20,-30,60,-10,50,100};
		int largest=numbers[0];
		int smallest=numbers[0];
		
		for(int i=1;i<numbers.length;i++)
		{
			if (numbers[i]>largest){
   largest=numbers[i];
		}
			else if(numbers[i]<smallest){
				smallest=numbers[i];
			}
		}
			System.out.println("GIVEN ARRAY IS "+ Arrays.toString(numbers));
		System.out.println("largest number is"+largest);
		System.out.println("smallest number is"+ smallest);
		// TODO Auto-generated method stub
		
	}

}
