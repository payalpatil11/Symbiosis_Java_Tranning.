import java.util.Scanner;
public class Average {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of element:");
        
		int num=sc.nextInt();
        int[] myarray=new int[num];
        
        System.out.println("Enter the numbers one by one:");
        
        for(int i=0;i<num;i++);{
        	int i=0;
        	myarray[i]=sc.nextInt();
        }
	double average=0;
	for(int i=0;i<num;i++) {
		average=average+myarray[i];
		
	}
	average=average/num;
	System.out.println("Average of given number:"+average);
	}

}
