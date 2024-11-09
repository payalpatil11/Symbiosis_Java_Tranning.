import java.util.Scanner;
public class factorical_number {
	
	public void factorial_number() {
		int num1,i;
		long factorial=1;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value:");
		num1=sc.nextInt();
		for(i=1;i<=num1;i++) {
				factorial=factorial*i;
	
	}
		System.out.println("Factorial of "+num1+"is:"+(factorial));
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		factorical_number obj=new factorical_number();
		obj.factorial_number();
		

	}

}
