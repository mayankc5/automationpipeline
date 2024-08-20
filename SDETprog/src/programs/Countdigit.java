package programs;

import java.util.Scanner;

public class Countdigit {

	
	public static void countDigit(int num) {
		int count=0;
		int sum=0;
		while(num!=0) {
			num=num/10;
			count++;
			
			
		}
		System.out.println("Sum of digit is"+count);
	}
	public static void main(String[] args) {
		
		System.out.println("Please a number to check count");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		countDigit(num);
	}

}
