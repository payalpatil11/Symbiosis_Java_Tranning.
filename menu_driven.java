import java.util.Scanner;
public class menu_driven {
	int num1,num2,result,choice;
	public void menu_driven() {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("1.  Addition");
		System.out.println("2.  Subtration");
		System.out.println("3.  Multiplication");
		System.out.println("4.  Divion");
		System.out.println("Select your choice(1-4):");
		choice= sc.nextInt();
		
		switch(choice) 
		{
		case 1:
			System.out.println("Enter the num1:");
			num1 =sc.nextInt();
			System.out.println("Enter the num2:");
			num2 =sc.nextInt();
			System.out.println("Addition is:"+(result=num1+num2));
			break;
		case 2:
			System.out.println("Enter the num1:");
			num1 =sc.nextInt();
			System.out.println("Enter the num2:");
			num2 =sc.nextInt();
			System.out.println("Subtraction is:"+(result=num1-num2));
			break;
		case 3:
			System.out.println("Enter the num1:");
			num1 =sc.nextInt();
			System.out.println("Enter the num2:");
			num2 =sc.nextInt();
			System.out.println("Multiplication is:"+(result=num1*num2));
			break;
		case 4:
			System.out.println("Enter the num1:");
			num1 =sc.nextInt();
			System.out.println("Enter the num2:");
			num2 =sc.nextInt();
			System.out.println("Division is:"+(result=num1/num2));
			break;
			
		default:
			System.out.println("Error");
			}
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		menu_driven obj=new menu_driven();
		obj.menu_driven();


	}

}
