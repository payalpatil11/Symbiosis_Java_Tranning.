import java.util.Scanner;
public class area_of_rectangle {
	
	double l,w,arearectangle;
	
	public void area_of_rectangle() {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the length:");
		l=sc.nextDouble();
		System.out.println("Enter the width:");
		w=sc.nextDouble();
		
		System.out.println("\nArea of rectangle is:"+(arearectangle=l*w));
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		area_of_rectangle obj=new area_of_rectangle();
		obj.area_of_rectangle();

	}

}
