import java.util.Scanner;
public class palindrome{
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int number;
		System.out.println("Enter the number:");
		number=sc.nextInt();
		int org_num=number;
		int rev=0;
		
		while(number!=0)
		{
			rev=rev*10+number%10;
			number=number/10;
		}
	//System.out.println(rev);
		if(org_num==rev) {
			System.out.println(org_num+" "+"is Palindrome number");
		}
		else {
			System.out.println(org_num+" "+"is not palindrome number");
		}
	}

}
