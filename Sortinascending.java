package javaLearnings;

public class Sortinascending {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		int a[]={6,3,2,8,1};
		int n=a.length;
		for(int i=0;i<n;i++)
		{
			for(int j=i+1;i<n;j++){
				if (a[i]>a[j])
				{
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
					
				}}}
				for(int i=0;i<n-1;i++){
					System.out.println(a[i]);
					
				}
				
			}
		}
	

