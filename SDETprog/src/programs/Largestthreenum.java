package programs;

public class Largestthreenum {

	public static void main(String[] args) {
		
		int a=30;
		int b=10;
		int c=25;
		int largest;
		
		largest=a>b?a:b;
		largest=c>largest?c:largest;
		System.out.println(largest);
	}

}
