import java.util.Scanner;
public class sort_an_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int a[]=new int[5];
		System.out.println("Enter the array elements:");
		for(int i=0;i<5;i++) {
			a[i]=sc.nextInt();
			
		}
		for(int i=0;i<5;i++) {
			for(int j=i+1;j<5;j++) {
				if(a[i]>a[j]) {
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
					
				}
			}
		}

		for (int i=0;i<5;i++) {
			System.out.println(a[i]+"");
		}
	}

}
