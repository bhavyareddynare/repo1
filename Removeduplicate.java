package javaLearnings;

import java.util.HashSet;
import java.util.Set;

public class Removeduplicate {

	public static void main(String[] args) {
		
		//this is worst method 0(n*n)
		String s[]={"java","c","python","javascript","java"};
		for(int i=0;i<s.length;i++)
		{
		for(int j=i+1;j<s.length;j++)
		{// TODO Auto-generated method stub
if(s[i].equals(s[j]))
{
	System.out.println("duplicate element is"+" "+ s[i]);
}
	}

}
		//using HashSet
		Set<String> set = new HashSet<String>();
		for(String name:s){
			if(set.add(name)==false){
				System.out.println("Duplicate element is ::"+ name);
			}
		}
		
	}
}
