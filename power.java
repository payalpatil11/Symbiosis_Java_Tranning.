import java.util.Scanner;
public class power {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);

		int number;
		System.out.println("Enter the number: ");
		number=sc.nextInt();
		
		int power=number*number*number;
		System.out.println(+ number +" raised to the power of "+"number"+" is : "+power);
	

	}

}
