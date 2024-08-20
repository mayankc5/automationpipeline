package programs;

public class Swaptwonum {
	
	public static void swap(int a,int b) {
		a=a+b;
		b=a-b;
		a=a-b;
		
		
		System.out.println("Value of num after swap :");
		System.out.println("Value of a :"+a);
		System.out.println("Value of b :"+b);
		
	}

	public static void main(String[] args) {
		
		int a=30;
		int b=50;
		
		swap(a,b);

	}

}
