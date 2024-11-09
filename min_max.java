import java.util.Scanner;

public class min_max {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of element:");
		int elements=sc.nextInt();
		int[]array=new int[elements];
		int max=array[0];
		int min=array[0];
		for(int i=1;i<elements;i++) {
			
			System.out.println("Enter the number:");
			array[i]=sc.nextInt();
			
			if(array[i]>max) {
				max=array[i];
				
			}
			
			if(array[i]<min) {
				min=array[i];
			}
			
		System.out.println("The maximum number is:"+max);
		System.out.println();
		System.out.println("The minimum number is:"+min);
		}

	}
}

