import java.util.Arrays;
import java.util.List;

public class Person2 {
   /** Holds the persons real name */
   private String name;

   /**
   * The constructor, takes in the persons name
   *
   * @param pname the person's real name
   */
   public Person2(String pname) {
       name = pname;
   }

   /**
   * This method should take the string input and return its characters in random
   * order. given "gtg123b" it should return something like "g3tb1g2".
   *
   * @param input the string to be modified
   * @return the modified string
   */
   private String calc(String input) {
       // thus line will initialize new string
       String newString = "";
       // the next line would be converting string to list
       List<String> characters = Arrays.asList(input.split(""));
     
       for (String value : characters) {
           newString = newString + value;
       }
       // given this line we can return new string
       return newString;
   }

   /**
   * Return a string rep of this object that varies with an input string
   *
   * @param input the varying string
   * @return the string representing the object
   */
   public String toString(String input) {
       return name + calc(input);
   }

   public static void main(String[] args) {
       // we are creating an object of Person2
       Person2 person2 = new Person2("gtg123b");
       //then we will print out the sting
       System.out.println(person2.toString("gtg123b"));

   }

}
