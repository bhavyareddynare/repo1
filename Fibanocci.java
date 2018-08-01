package javaLearnings;

public class Fibanocci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int fibsize=10;
		int[] fib= new int[fibsize];
		fib[0]=0;
		fib[1]=1;
		for (int i =2;i<fibsize;i++)
		{
			fib[i]=fib[i-1]+fib[i-2];
			
			
		}
		
		for (int i =0;i<fibsize;i++)
		{
		
			System.out.print(fib[i]+" ");
		}
	}

}
