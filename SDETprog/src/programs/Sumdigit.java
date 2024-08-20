package programs;

import java.util.Scanner;

public class Sumdigit {

	public static void sumDigit(int num) {
		
		int sum=0;
		while(num!=0) {  
			sum=sum+num%10; 
			num=num/10;
			
		}
		System.out.println("Sum of digit is"+sum);
	}
	public static void main(String[] args) {
		
		System.out.println("Please a number to check sum");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		sumDigit(num);
	}
}