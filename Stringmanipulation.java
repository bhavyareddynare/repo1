package javaLearnings;

public class Stringmanipulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="i love india";
		System.out.println(str.length());
		System.out.println(str.indexOf("i"));
		System.out.println(str.charAt(4));
		System.out.println(str.indexOf("i",6));
		//or below one
System.out.println(str.indexOf("i",str.indexOf("i")+1));//2nd occurance the i
System.out.println(str.indexOf("i",str.indexOf("i",str.indexOf("i")+1)+1));//3rd occurance of i 
System.out.println(str.indexOf("love"));
System.out.println(str.indexOf("hello"));//if it is not there it will return -1

	//String comparision
String str1="i love India";
System.out.println(str.equals(str1));
System.out.println(str.equalsIgnoreCase(str1));
System.out.println(str.substring(2, 8));
String str3="    Hello world   ";
System.out.println(str3.trim());
System.out.println(str.replace("e", "a"));
//split
String test="hello_world_selenium";

String test1[]=test.split("_");
for (int i=0;i<test1.length;i++){
	System.out.println(test1[i]);
}


	
	}
}
