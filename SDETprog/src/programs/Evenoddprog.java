package programs;

import java.util.Scanner;

public class Evenoddprog {

	public static void countEvenOdd(int num) {
		int countOdd=0;
		int countEvenn=0;
		int rem;
		
		while(num!=0) {
			rem=num%10;
			
			if(rem%2==0) {
				countEvenn++;
			}
			else
			{
				countOdd++;
			}
				num=num/10;
		}
		System.out.println("Count of even digit is"+countEvenn);
		System.out.println("Count of odd digit is"+countOdd);
	}
	public static void main(String[] args) {
		
		System.out.println("Please a number to check even odd count");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		countEvenOdd(num);
	}

}
