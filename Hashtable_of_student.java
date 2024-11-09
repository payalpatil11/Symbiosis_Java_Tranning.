import java.time.LocalDate;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Scanner;
import java.util.HashMap;


class Student {
	int Rollno;
	LocalDate DOB;
	String StuName;
	String CourseEnrnolled;
	
	public Student(int rollno, String dOB, String stuName, String courseEnrnolled) {
		Rollno = rollno;
		DOB =LocalDate.parse(dOB);
		StuName = stuName;
		CourseEnrnolled = courseEnrnolled;
	}


	@Override
	public String toString() {
		return "StuHashTable [Rollno=" + Rollno + ", DOB=" + DOB + ", StuName=" + StuName + ", CourseEnrnolled="
				+ CourseEnrnolled + "]";
	}
 }

public class Hashtable_of_student {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Hashtable<Integer,Student>StuTable=new Hashtable<>();	
		Scanner sc=new Scanner (System.in);
		char ch;
		do {
			try {
				System.out.println("Enter the Roll no : ");
				int Rollno=sc.nextInt();
				System.out.println("Enter the Date of Brith(yyyy-mm-dd): ");
				String DOB=sc.next();
				System.out.println("Enter the Student Name: ");
				String StuName=sc.next();
				System.out.println("Enter the Course Name: ");
				String CourseEnrnolled=sc.next();
				
				StuTable.put(Rollno,new Student(Rollno,DOB,StuName,CourseEnrnolled));
			}catch(Exception e) {
				System.out.println("An unexpected error occured "+e.getMessage());
			}
			System.out.println("Do you want add student: ");
			ch=sc.next().charAt(0);
		}while(ch=='Y'||ch=='y');
		Enumeration<Integer>rollNumber=StuTable.keys();
		while(rollNumber.hasMoreElements()) {
			System.out.println(StuTable.get(rollNumber.nextElement()));
			}



	}

}
