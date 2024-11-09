import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class Employee_Retirment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		try {
			System.out.println("Enter the Date of Birth in the format of YYYY-MM-DD : ");
			String dateofbirth=sc.next();
			
			LocalDate DOB=LocalDate.parse(dateofbirth);
			LocalDate currentDate=LocalDate.now();
			
			Period Age=Period.between(DOB, currentDate);
			System.out.println("Your current age is : " + Age.getYears() + " Years, "+ Age.getMonths() + " Months, "+ Age.getDays() + " Days. ");
			
			LocalDate RetirementDate=DOB.plusYears(58);
			System.out.println("Your Retirement Date will be: "+RetirementDate);
			}catch(Exception e) {
			System.out.println("....Invalid Age....");
			}

	}

}
