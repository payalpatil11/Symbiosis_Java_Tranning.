import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.InputMismatchException;
import java.util.Scanner;

/*
 * Write a Program for accepting employee data like 
 * employee ID, Name, Salary, and Location.
 * Depending upon user choice to search or sort employee records from the collection.
 */

class InvalidMenuChoiceException extends Exception {

	public InvalidMenuChoiceException(String message) {
		super(message);
	}

}

class Staff {
	static int currentID;
	private int staffId;
	private String staffName, staffLocation;
	private float salary;
	static {
		currentID = 1000;
	}

	public Staff(String staffName, String staffLocation, float salary) {
		super();
		this.staffId = currentID++;
		this.staffName = staffName;
		this.staffLocation = staffLocation;
		this.salary = salary;
	}
	public static int getCurrentID() {
		return currentID;
	}

	public static void setCurrentID(int currentID) {
		Staff.currentID = currentID;
	}

	public int getStaffId() {
		return staffId;
	}

	public void setStaffId(int staffId) {
		this.staffId = staffId;
	}

	public String getStaffName() {
		return staffName;
	}

	public void setStaffName(String staffName) {
		this.staffName = staffName;
	}
	public String getStaffLocation() {
		return staffLocation;
	}

	public void setStaffLocation(String staffLocation) {
		this.staffLocation = staffLocation;
	}

	public float getSalary() {
		return salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return this.staffName + " [\nStaff ID : " + staffId + "\nStaff Name : " + staffName + "\nStaff Location : " + staffLocation
				+ "\nSalary : " + salary + "\n]";
	}
}
class SortByStaffId implements Comparator<Staff> {

	@Override
	public int compare(Staff s1, Staff s2) {
		return Integer.compare(s1.getStaffId(), s2.getStaffId());
	}
}

class SortByStaffName implements Comparator<Staff> {

	@Override
	public int compare(Staff s1, Staff s2) {
		return s1.getStaffName().compareTo(s2.getStaffName());
	}
}

class SortByStaffLocation implements Comparator<Staff> {

	@Override
	public int compare(Staff s1, Staff s2) {
		return s1.getStaffLocation().compareTo(s2.getStaffLocation());
	}
}

class SortByStaffSalary implements Comparator<Staff> {

	@Override
	public int compare(Staff s1, Staff s2) {
		return Float.compare(s2.getSalary(), s1.getSalary());
	}
}






public class Employee {
	
	static void displayStaff(ArrayList<Staff> staffList) {
		for (Staff s : staffList) {
			System.out.println(s);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		ArrayList<Staff> staffList = new ArrayList<Staff>();

		char continueMenu = 'y';
		do {
			try {
				System.out.print(
						"\n1. Add Staff Record" + 
						"\n2. Display Staff" + 
						"\n3. Sort Staff by ID" +
						"\n4. Sort Staff by Name" + 
						"\n5. Sort Staff by Salary" + 
						"\n6. Sort Staff by Location" + 
						"\nEnter Your Choice: ");
				int choice = sc.nextInt();

				switch (choice) {
				case 1:
					char addMore = 'y';
					do {
						try {
							System.out.println("\n------Enter Staff Details-----");
							System.out.print("Enter Name: ");
							String staffName = sc.next();
							System.out.print("Enter Location: ");
							String location = sc.next();
							System.out.print("Enter Salary: ");
							float salary = sc.nextFloat();
							staffList.add(new Staff(staffName, location, salary));
						} catch (InputMismatchException e) {
							System.out.println("Invalid input! Please enter correct data.");
							sc.nextLine(); // Clears the buffer
						}

						System.out.print("\nDo You Want To Add Another Record (y/n): ");
						addMore = sc.next().charAt(0);

					} while (addMore == 'Y' || addMore == 'y');
					break;

				case 2:
					displayStaff(staffList);
					break;

				case 3:
					Collections.sort(staffList, new SortByStaffId());
					System.out.println("Sorted by Staff ID successfully...\n");
					displayStaff(staffList);
					break;

				case 4:
					Collections.sort(staffList, new SortByStaffName());
					System.out.println("Sorted by Staff Name successfully...\n");
					displayStaff(staffList);
					break;

				case 5:
					Collections.sort(staffList, new SortByStaffSalary());
					System.out.println("Sorted by Staff Salary successfully...\n");
					displayStaff(staffList);
					break;
				case 6:
					Collections.sort(staffList, new SortByStaffLocation());
					System.out.println("Sorted by Staff Location successfully...\n");
					displayStaff(staffList);
					break;

				default:
					System.out.println("Invalid Input! Please enter a valid choice.");
				}

			} catch (InputMismatchException e) {
				System.out.println("Invalid input! Please try again...");
				sc.nextLine();
			}

			System.out.print("\nReturn to Main Menu (y/n): ");
			continueMenu = sc.next().charAt(0);

		} while (continueMenu == 'Y' || continueMenu == 'y');
		System.out.println("Program Terminated.");
	




			



	}

}
