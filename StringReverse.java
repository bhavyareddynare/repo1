package javaLearnings;

public class StringReverse {

	public static void main(String[] args) {
		//using for loop
		String s= "i love india";
		String rev= "";
		for (int i=s.length()-1;i>=0;i--)
		{
			rev=rev+s.charAt(i);
		}
		System.out.println(rev);
		
		//using string buffer
		StringBuffer sb=new StringBuffer(s);
		System.out.println(sb.reverse());
	}

}
