import java.util.Scanner;
public class circumference_of_circle {
	
	double r,circumcircle;
	double p=3.14;
	
	public void circumference_of_circle() {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the redius:");
		r=sc.nextDouble();
		
		System.out.println("\nCircumference of circle is:"+(circumcircle=2*p*r));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		circumference_of_circle obj=new circumference_of_circle();
		obj.circumference_of_circle();
		

	}

}
