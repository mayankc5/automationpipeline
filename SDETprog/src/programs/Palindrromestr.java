package programs;

import java.util.Scanner;

public class Palindrromestr {

	public static void checkPalindrome(String str,String rev) {
		for(int i=str.length()-1;i>=0;i--) {
			
			rev=rev+str.charAt(i);
			
		}
		System.out.println("Check Plaindrome String :");
		
		if(str.equalsIgnoreCase(rev)) {
			System.out.println("Plaindrome String :");
		}
		
		else
		{
			System.out.println("Not Plaindrome String :");
		}
	}
	
	
	public static void main(String[] args) {
		String rev="";
		System.out.println("Please a string to check reverse");
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		checkPalindrome(str,rev);

	}

}