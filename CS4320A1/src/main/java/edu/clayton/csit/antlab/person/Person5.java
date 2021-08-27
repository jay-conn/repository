package edu.clayton.csit.antlab.person;

/**
 *  A simple class for person 5
 *  returns their name and a
 *  modified string 
 *  
 *  @author Qu
 *  @version 1.1
 */
import java.util.*;

public class Person5 {
  /** Holds the persons real name */
  private String name;
  	/**
	 * The constructor, takes in the persons
	 * name
	 * @param pname the person's real name
	 */
  public Person5(String pname) {
    name = pname;
  }
  	/**
	 * This method should take the string
	 * input and return its characters rotated
	 * 2 positions.
	 * given "gtg123b" it should return
	 * "g123bgt".
	 *
	 * @param input the string to be modified
	 * @return the modified string
	 */
	private String calc(String input) {
	  //Person 5 put your implementation here
	  	//creating array to hold caracters in name
		char[] modName = new char[pname.length()];
		//populating array
		for(int i = 0; i < pname.length(); i++){
			//shifting characters 2 spaces over
			if(i - 2 > 0){
				int j = i-2;
				modName[j] = pname.charAt(i);
			}
			else(){
				int j = i + pname.length() - 2;
				modName[j] = pname.charAt(i);
			}

		}
		//printing array
		for(int i = 0; i < pname.length(); i++){
			System.out.print(modName[i]);
		}
	  return null;
	}
	
	/**
	 * Return a string rep of this object
	 * that varies with an input string
	 *
	 * @param input the varying string
	 * @return the string representing the 
	 *         object
	 */
	
	public String toString(String input) {
	  return name + calc(input);
	}
}
