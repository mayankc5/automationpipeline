package programs;

public class Fiboprog {

	public static void main(String[] args) {
		int num1=0;
		int num2=1;
		int sum=0;
		
		System.out.println(num1);
		System.out.println(num2);
		
		for(int i=0;i<6;i++) {
			
			sum=num1+num2;	 //1234567  // 0 1 1
			System.out.print(sum+" ");
			num1=num2;
			num2=sum;
			
		}
		
		

	}

}
