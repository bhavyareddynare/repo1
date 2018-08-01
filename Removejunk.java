package javaLearnings;

public class Removejunk {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s= "@%$@%@^@ bhavya ^%^&*^* reddy 10490284";
		//using regular expression
		System.out.println(s.replaceAll("[^a-zA-Z0-9]","QR"));

	}

}
