/**
 * The Username class represents a user's information, specifically their first name, last name, and student number.
 * <p>File name: Username.java </p>
 * <p>Author: Ben Nguyen </p>
 * <p>Course: CST8284 - OOP </p>
 * <p>Assignment: Lab 01 </p>
 * <p>Date: May 20, 2023 </p>
 * <p>Professor: Dave Houtman </p>
 * <p>Purpose: Defines the Username class and provides methods to get and set the values of these variables.
 * Additional methods to retrieve specific parts of the user's information. </p>
 */
public class Username {
	private String firstName;
	private String lastName;
	private long studentNum;
	
    /**
     * Constructs a Username object with first name, last name, and student number.
     * @param firstName the first name of the user
     * @param lastName the last name of the user
     * @param studentNum the student number of the user
     */
	public Username(String firstName, String lastName, long studentNum){
		this.firstName = firstName;
		this.lastName = lastName;
		this.studentNum = studentNum;
	}

	/**
	 * A no-argument constructor for the Username class
	 */
	public Username() {
	}

	/**
	 * Retrieves the first name of the user
	 * @return the first name of the user
	 */
	public String getFirst_name() {
		return firstName;
	}
	
     /**
      * <p>This is a set method to set the first name of the user.
      * It also gets rid of the leading and trailing spaces for firstName. </p>
      * <p>Uses trim(), which I learned about in a geeksforgeeks post </p>
	  * <p>Reference: </p>
	  * <p>Java String trim() method with Example. geeksforgeeks.org. </p>
	  * <p>Author: ChetnaAgarwal. </p>
	  * <p>https://www.geeksforgeeks.org/java-string-trim-method-example/. (Accessed: May 18, 2023). </p>
      * @param firstName the first name to be set for the user
	  */
	public void setFirst_name(String firstName) {
		this.firstName = firstName.trim();
	}

	/**
	 * Retrieves the last name of the user.
	 * @return the last name of the user
	 */
	public String getLast_name() {
		return lastName;
	}

	 /**
      * <p>This is a set method to set the last name of the user.
      * It also gets rid of the leading and trailing spaces for lastName. </p>
      * <p>Uses trim(), which I learned about in a geeksforgeeks post </p>
	  * <p>Reference: </p>
	  * <p>Java String trim() method with Example. geeksforgeeks.org. </p>
	  * <p>Author: ChetnaAgarwal. </p>
	  * <p>https://www.geeksforgeeks.org/java-string-trim-method-example/. (Accessed: May 18, 2023). </p>
	  * @param lastName the last name to be set for the user
	  */
	public void setLast_name(String lastName) {
		this.lastName = lastName.trim();
	}

	/**
	 * Retrieves the student number of the user
	 * @return the student number of the user
	 */
	public long getStudent_num() {
		return studentNum;
	}
	
	/**
	 * <p>This is a set method to set the student number of the user. </p>
	 * @param studentNum the student number to be set for the user
	 * @exception java.util.InputMismatchException if input is not an integer between -2^63 and 2^63-1. This information is taken from the following post.
     * <p>Reference: </p>
	 * <p>The Java Tutorials. oracle.com. </p>
	 * <p>https://docs.oracle.com/javase/tutorial/java/nutsandbolts/datatypes.html#:~:text=long%3A%20The%20long%20data%20type,value%20of%20264%2D1. (Accessed: May 20, 2023) </p>
	 */
	public void setStudent_num(long studentNum) {
		this.studentNum = studentNum;
	}
	
	/**
	 * <p>This method return the first 3 digits of student number. </p>
	 * <p>I took the general idea from the following post, which described a method to get the first digit of a number. </p>
	 * <p>If student number is already 3 digits or less, method will return that number without any change. </p>
	 * <p>If student number is a negative number, method will return that number without any change. </p>
	 * <p>This method will ignore leading and trailing spaces. </p>
	 * <p>Reference: </p>
	 * <p>Find first and last digits of a number. geeksforgeeks.org. </p>
	 * <p>Author: Mithun Kumar. </p>
	 * <p>https://www.geeksforgeeks.org/find-first-last-digits-number/. (Accessed: May 18, 2023). </p>
	 * @return the first three digits of the student number
	 */
	public long getFirstThreeDigits() {
		long firstThreeDigits = studentNum;
		// This while loop repeatedly divides the number by 10 until the number has 3 digits
		// Since firstThreeDigits is a long type, it will ignore the decimals 
		while (firstThreeDigits > 999) {
			firstThreeDigits = firstThreeDigits / 10;			
		}
		return firstThreeDigits;		
	}
	
	/**
	 * <p>This method returns the last character of first name. </p>
	 * <p>Method will still work if first name is a number. </p>
	 * <p>Method will still work if input has leading and/or trailing spaces. </p>
     * <p>Uses substring(), which I learned about in a javatpoint post. </p>
	 * <p>Reference: </p>
	 * <p>Java String substring(). javatpoint.com. </p>
	 * <p>https://www.javatpoint.com/java-string-substring. (Accessed: May 18, 2023). </p>
	 * @return the last character of the first name
	 * @exception StringIndexOutOfBoundsException if the first name is empty
	 */	
	public String getLastChar() {
		String lastChar = firstName.substring(firstName.length()-1); //length()-1 is the index of the last character
		return lastChar;
	}
	
	/**
	 * <p>This method returns the first 3 characters of last name. </p>
	 * <p>Method will still work if last name is a number, but the number has to have at least 3 digits. </p>
	 * <p>Method will still work if input has leading and/or trailing spaces. </p>
	 * <p>Uses substring(), which I learned about in a javatpoint post. </p>
	 * <p>Reference: </p>
	 * <p>Java String substring(). javatpoint.com </p>
	 * <p>https://www.javatpoint.com/java-string-substring. (Accessed: May 18, 2023) </p>
	 * @return the first three characters of the last name
	 * @exception StringIndexOutOfBoundsException if the last name does not have at least 3 characters
	 */
	public String getFirstThreeChar() {
		String firstThreeChar;
		firstThreeChar = lastName.substring(0,3);	// substring() takes characters whose indexed are 0,1 and 2
		return firstThreeChar;
	}
	
	/**
	 * This method makes a report that contains last character of first name,
	 * first 3 numbers of the student number and first 3 letters of last name
	 * @return a report containing the specified information in lowercase
	 */
	public String createUsername() {		
		long firstThreeDigits = getFirstThreeDigits();
		String lastChar = getLastChar();
		String firstThreeChar = getFirstThreeChar();
		String report = lastChar + firstThreeDigits + firstThreeChar;		
		return report.toLowerCase();
	}
}