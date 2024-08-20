package programs;

public class Sumelementarray {

	public static void main(String[] args) {
		int arr[]= {8,2,1,9,4,6};
		int sum=0;
		
		for(int i=0;i<arr.length;i++) {
			sum=sum+arr[i];
		}
		
		System.out.println("Sum pof elements in Arrays:");
		System.out.println(sum);
	}

}
