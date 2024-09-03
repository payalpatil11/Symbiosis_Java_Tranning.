import java.util.Scanner;
public class area_circumference {
	double l,w,r,arearectangle,areacircle,circumcircle;
	double p=3.14;
	public void area_circumference() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the length:");
		l=sc.nextDouble();
		System.out.println("Enter the width:");
		w=sc.nextDouble();
		System.out.println("Enter the redius:");
		r=sc.nextDouble();
		System.out.println("\nArea of rectangle is:"+(arearectangle=l*w));
		System.out.println("\nArea of circle is:"+(areacircle=p*r*r));
		System.out.println("\nCircumference of circle is:"+(circumcircle=2*p*r));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		area_circumference obj=new area_circumference();
		obj.area_circumference();
		

	}

}
