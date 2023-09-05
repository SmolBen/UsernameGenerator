import java.util.Scanner;

/**
 * The Driver class is used for inputting and displaying student information.
 * <p>File name: Driver.java </p>
 * <p>Author: Ben Nguyen </p>
 * <p>Date: May 20, 2023 </p>
 * <p>Purpose: Facilitates the input and display of student information.
 * This class prompts the user to enter a first name, last name, and student number,
 * and then displays a username, which is composed of the last character of first name, first 3 numbers. </p>
 */
public class Driver {
	/**
	 * @param args parameter is not used
	 */
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		// Create an instance of the Username class	
		Username username = new Username();
		
		System.out.print("Enter first name: ");
		
		// Set the first name in the Username object
		String firstName = input.nextLine();
		username.setFirst_name(firstName);
		
		System.out.print("Enter last name: ");
		
		// Set the last name in the Username object
		String lastName = input.nextLine();
		username.setLast_name(lastName);
		
		System.out.print("Enter student number: ");
		
		// Set the student number in the Username object
		long studentNum = input.nextLong();
		username.setStudent_num(studentNum);
		
		input.close();
		
		System.out.println(username.createUsername());
		
		System.out.println("Program by Ben Nguyen");
	}
}