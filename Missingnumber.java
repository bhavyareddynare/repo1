package javaLearnings;


public class Missingnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1245--here missing number is 3
		//we can find by sum 1+2+4+5=12 and 1+2+3+4+5=15
//15-12=3 is the missing number
		
		int arr[]= {1,2,4,5};
		int sum =0;
		for (int i=0;i<arr.length;i++){
			sum=sum+arr[i];
		}
	System.out.println(sum);
	
	int sum1=0;	
	for (int j=1;j<=5;j++){
		sum1=sum1+j;
	}
	System.out.println(sum1);
	System.out.println("missing numberis: "+ (sum1-sum));
	}

}
