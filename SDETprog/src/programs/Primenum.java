package programs;

public class Primenum {

	public static void main(String[] args) {
		int num=16;
		int count=0;
		
		if(num>1) {
			for(int i=1;i<=num;i++) {
				
				if(num%i==0) {
					count++;
				}
			}
			
			if(count==2) {
				System.out.println("Number is Prime");
			}
			
			else
			{
				System.out.println("Number is Not Prime");
			}
		}

	}

}
