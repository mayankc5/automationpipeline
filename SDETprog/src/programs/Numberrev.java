package programs;

import java.util.Scanner;

public class Numberrev {
	
	public static void revNum(int num,int rev) {
		
		while(num!=0) {
			
			rev=rev*10+num%10;
			num=num/10;
		}
		
		System.out.println("Reverse of number :");
		System.out.println(rev);
	}

	public static void main(String[] args) {
		int rev=0;
		System.out.println("Please a number to check reverse");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		revNum(num,rev);
		

	}

}
