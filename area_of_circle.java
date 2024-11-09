import java.util.Scanner;
public class area_of_circle {
	
	double r,areacircle;
	double p=3.14;
	
	public void area_of_circle() {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the redius:");
		r=sc.nextDouble();
		
		System.out.println("Area of circle is:"+(areacircle=p*r*r));
		
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		area_of_circle obj=new area_of_circle();
		obj.area_of_circle();

	}

}
