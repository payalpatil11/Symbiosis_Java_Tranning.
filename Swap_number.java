import java.util.Scanner;
public class Swap_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int num1,num2, temp;
		
		Scanner sc=new Scanner (System.in);
		
		System.out.println("****Befor Swaping****:");
		System.out.println("Enter the Num1:");
		num1=sc.nextInt();
		System.out.println("Enter the Num2:");
		num2=sc.nextInt();
		
		
		temp=num1;
		num1=num2;
		num2=temp;
		
		System.out.println("****After Swaping****");
		System.out.println("num1:"+num1);
		System.out.println("num2:"+num2);

	}

}
