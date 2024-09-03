import java.util.Scanner;
public class check_number {

	public static void main(String[] args) {
		//TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the character:");
		char ch=sc.next().charAt(0);
		
		if(ch>='A' && ch<='Z' || ch>='a' && ch<='z') {
			System.out.println("This is charatar");
			
		}
		else if(ch>=0 && ch<=9) {
			System.out.println("This is Digit");
		}
		else {
			System.out.println("This is symbol");
		}

	}

}
