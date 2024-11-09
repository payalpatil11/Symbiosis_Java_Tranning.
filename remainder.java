import java.util.Scanner;
public class remainder {
	
	int num1,num2,result;
	
	public void remainder() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number1:");
		num1=sc.nextInt();
		System.out.println("Enter the number2:");
		num2=sc.nextInt();
		result=num1-(num1/num2)*num2;
		System.out.println("remainder is :"+result);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		remainder obj=new remainder();
		obj.remainder();


	}

}
