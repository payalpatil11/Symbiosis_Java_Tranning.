import java.util.Scanner;

public class Simple_Interest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double p,r,t,SI,CI;
		 
		 Scanner sc=new Scanner(System.in);
		 
		 System.out.println("Enter the principl: ");
		 p=sc.nextDouble();
		 System.out.println("Enter the Annual Rate: ");
		 r=sc.nextDouble();
		 System.out.println("Enter the Time(in year): ");
		 t=sc.nextDouble();
		 
		 System.out.println("Simple Interest is: "+(SI=p*r*t/1000));


	}

}