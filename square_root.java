import java.util.Scanner;
public class square_root {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		double number,Square;
		
		System.out.println("Enter the number:");
		number=sc.nextInt();
		
		Square=Math.sqrt(number);
		System.out.println("Square root of"+" "+number+" "+"is:"+Square);
			
	}
	

}
