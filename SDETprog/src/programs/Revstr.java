package programs;

import java.util.Scanner;

public class Revstr {

	
	public static void revString(String str,String rev) {
		for(int i=str.length()-1;i>=0;i--) {
			
			rev=rev+str.charAt(i);
			
		}
		System.out.println("Reverse of String is :");
		System.out.println(rev);
	}
	
	
	public static void main(String[] args) {
		String rev="";
		System.out.println("Please a string to check reverse");
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		revString(str,rev);

	}

}
