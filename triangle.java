package javaLearnings;

public class triangle {
	public static void main(String[] args) {
		int n = 5;
		// no.of spaces	
int k = 2 * n - 2;
		// outer loop to handle rows
		for (int i = 1; i <= n; i++) 
		{
		
			// loop to handle spaces
			for (int j = 1; j <= k; j++) 
			{
				// printing spaces
				System.out.print(" ");
	        }
       // decrementing k for each loop
			k = k - 1;
			// to handle columns
	for (int j = 1; j <= i; j++) 
			{
				System.out.print("* ");

			}
			System.out.println();
			
		}
		
		 
	}
	// TODO Auto-generated method stub

}
