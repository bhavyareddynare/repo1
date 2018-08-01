package javaLearnings;

public class Pyramidreverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		int k=2*n-2;
		for(int i=1;i<=n;i++)
		{
			int num =1;
			for (int j=1;j<=k;j++)
			{
				System.out.print(" ");
			}
			k=k-2;
			for (int j=1;j<=i;j++)
			{
				System.out.print(num+ " ");
				num=num+1;
			}
			System.out.println();
		}
		
		

	}

}
