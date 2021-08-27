package edu.clayton.csit.antlab.person;

/**
 *  A simple class for person 2
 *  returns their name and a
 *  modified string 
 *
 * @author Qu
 * @version 1.1
 */
public class Person2 {
    /** Holds the persons real name */
    private String name;
	 	/**
	 * The constructor, takes in the persons
	 * name
	 * @param pname the person's real name
	 */
	 public Person2(String pname) {
	   name = pname;
	 }

/**
	 * This method should take the string
	 * input and return its characters in
	 * random order.
	 * given "gtg123b" it should return
	 * something like "g3tb1g2".
	 *
	 * @param input the string to be modified
	 * @return the modified string
	 */


/**this line is the main method to the program*/
public static void main(String[] args) {
//this line would create a new Scanner instance
Scanner input = new Scanner(System.in);

//this line tell us to enter a string in order to print the line
System.out.print("Enter string : ");


//this would advance the scanner past the current line and returns the input that was skipped.
String str = input.nextLine();
String result = calc(str);
//process the line 
System.out.println("Result is : " + result);
//here we are printing out our result
}


/** here the method we used to get all numbers and store it*/
private static String calc(String str) {
if (str.length() > 2) {
char first = str.charAt(0);
char second = str.charAt(1);
str = (str.substring(1)).substring(1);
return str + first + second;
}

return str;

} 

} // end of method

} // end of class
