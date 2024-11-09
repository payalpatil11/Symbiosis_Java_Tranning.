import java.util.Scanner;
public class ASCII_value {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char ch;
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("The ASCII value of is:");
		ch=sc.next().charAt(0);
		int ascii=ch;
		int castascii=(int)ch;
		System.out.println("The ASCII value of"+" "+ch+" "+"is:"+castascii);
		


	}

}
