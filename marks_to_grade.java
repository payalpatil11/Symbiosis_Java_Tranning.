import java.util.Scanner;
public class marks_to_grade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int marks[]=new int[6];
		int i;
		float total=0,avg;
		Scanner sc=new Scanner(System.in);
		for(i=0;i<6;i++) {
			System.out.println("Enter marks:");
			marks[i]=sc.nextInt();
			total=total+marks[i];
			
			
		}
		sc.close();
		avg=total/6;
		System.out.println("The student grade is:");
		if(avg>=80)
		{
			System.out.println("A");
		}
		else if(avg>=60 && avg<80)
		{
			System.out.println("B");
		}
		else if(avg>=40 && avg<60)
		{
			System.out.println("C");
		}
		else {
			System.out.println("D");
		}
		
		}

	}


