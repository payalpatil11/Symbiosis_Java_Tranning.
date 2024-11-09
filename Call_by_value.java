
public class Call_by_value {
	public static void Swap(int num1,int num2) {
		System.out.println("Before swapping:");
		System.out.println("Num1:"+num1);
		System.out.println("Num2:"+num2);
		
		num1=num1+num2;
		num2=num1-num2;
		num1=num1-num2;
		
		System.out.println("After Swapping:");
		System.out.println("Num1:"+num1);
		System.out.println("Num2:"+num2);
		
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num1=10;
		int num2=20;
		Swap(num1,num2);
		
	}

}
