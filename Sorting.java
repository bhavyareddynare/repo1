package javaLearnings;

public class Sorting {

	public static void main(String[] args) {
		int a[]={6,3,2,8,1};
		int n =a.length;
		for(int i=0;i<n;i++){
			for(int j=i+1;j<n;j++){
				if(a[i]>a[j]){
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
					
				}
			}
				
		}
		
		
		for(int i=0;i<n;i++){
			System.out.print(a[i]);
		}
		// TODO Auto-generated method stub

	}

}
