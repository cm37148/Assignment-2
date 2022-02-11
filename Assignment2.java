package assignment;
import java.util.Scanner;
import java.util.regex.Pattern;
public class Assignment2 {

	  public static void main(String[] args) {
	        System.out.println(returnTheLengthOfTheString("")); //0
	        System.out.println(returnTheLengthOfTheString("a")); //1
	        System.out.println(returnTheLengthOfTheString("The Annual Convention of UPE will held in cyberspace on Friday, March 25, 2022, from 1- 3 PM")); //92
	        System.out.println(returnTheLengthOfTheString(null)); //-1
	        
	        System.out.println(returnTheCharacterAtTheGivenIndex("1999", 2)); //9
	        System.out.println(returnTheCharacterAtTheGivenIndex("CSCI1302", 0)); //C
	        System.out.println(returnTheCharacterAtTheGivenIndex("Chicken Wrap", 7)); // white space

	        System.out.println(returnTheSubStringStartingAtTheGivenIndex("1999", 2)); //99
	        System.out.println(returnTheSubStringStartingAtTheGivenIndex("CSCI1302", 0)); //CSCI1302
	        System.out.println(returnTheSubStringStartingAtTheGivenIndex("Chicken Wrap", 7)); // (white space)Wrap

	        System.out.println(returnTheSubStringBetweenStartAndEndIndex("1999", 2,3)); //9
	        System.out.println(returnTheSubStringBetweenStartAndEndIndex("CSCI1302", 0,4)); //CSCI
	        System.out.println(returnTheSubStringBetweenStartAndEndIndex("Chicken Wrap", 4,7)); // ken

	        System.out.println(changeAllOccurancesOf1999To2022("1999")); //2022
	        System.out.println(changeAllOccurancesOf1999To2022("1999 was all about 1999"));
	        System.out.println(changeAllOccurancesOf1999To2022("Two thousand zero zero party over, oops, out of time\r\n"
	                + "(No, no)\r\n"
	                + "So tonight I'm gonna party like it's 1999\r\n"
	                + "Alright, 1999\r\n"
	                + "You say it, 1999\r\n"
	                + "Mmm 1999\r\n"
	                + "(Oww, 1999)")); 

	        System.out.println(checkIfPasswdIsValid("Winter11a")); //true
	        System.out.println(checkIfPasswdIsValid("Wint11a")); //false - less than minimum length
	        System.out.println(checkIfPasswdIsValid("WinterWonderland11a")); //false - more than max length
	        System.out.println(checkIfPasswdIsValid("winter11a")); //false -  does not start with uppercase letter
	        System.out.println(checkIfPasswdIsValid("Winter11A")); //false - does not end with lowercase letter
	        System.out.println(checkIfPasswdIsValid("Winter1_a")); //false - the second to last letter is not a number or !
	        System.out.println(checkIfPasswdIsValid("Winter1!a")); //true
	        System.out.println(checkIfPasswdIsValid("Metere!d")); //true
	        System.out.println(checkIfPasswdIsValid("Secondary!2s")); //true
	        System.out.println(checkIfPasswdIsValid("Breaded!x")); //true

	        System.out.println(countNumberOfValidEmailAddresses("a@b.comjamaicawhatever jam@jammer.edu")); //2
	        System.out.println(countNumberOfValidEmailAddresses("a@b")); //0
	        System.out.println(countNumberOfValidEmailAddresses(".net")); //0
	        System.out.println(countNumberOfValidEmailAddresses("bb@a.net")); //1
	        System.out.println(countNumberOfValidEmailAddresses("forever.and.ever@justdoit.net csciinstructor@georgiasouthern.edu, micromanager@igotnothingbettertodo.com")); //3
	    }
	    
	    /*
	     * return the length of a given string
	     * return -1 if the string is null
	     */
	    public static int returnTheLengthOfTheString(String word) {
	    	if (word == null) {
	    		return -1;
	    	}
	    	int wordlength = word.length();
	        return wordlength;
	    
	    }
	    
	   /*
	    *return the character at the given index in word 
	   */
	    public static char returnTheCharacterAtTheGivenIndex(String word, int index) {
	    	char ch = word.charAt(index);
	        return ch;
	    }
	    
	    /*
	     * return the substring starting from the given index
	     */
	    public static String returnTheSubStringStartingAtTheGivenIndex(String word, int index) {
	    	String s1 = word.substring(index);
	        return s1;
	    }
	    
	    /*
	     * return the substring from the start index to the end index
	     */
	    public static String returnTheSubStringBetweenStartAndEndIndex(String word, int startIndex, int endIndex) {
	    	String s2 = word.substring(startIndex, endIndex);
	        return s2;
	    }
	    
	    /*
	     * if there are occurrences of 1999 in the paragraph, replace with 2022
	     */
	    public static String changeAllOccurancesOf1999To2022(String paragraph) {
	    	char oldChar = 1999;
	    	char newChar = 2022;
	    	String s3 = paragraph.replace(oldChar,newChar);
	        return s3;
	    }
	    
	    /*
	     * A valid password has the following pattern
	     * - starts with an uppercase letter
	     * - ends with a lowercase letter
	     * - the second to last character is either a number or !
	     * - the length is at least 8 but no more than 12  
	     */
	    public static boolean checkIfPasswdIsValid(String passwd) {
	    	boolean result = Pattern.matches("[A-Z], [.]{8,12}, [0-9]|[!], [a-z]", passwd);
	        return result;
	    }
	    
	    /*
	     * For the purposes of this assignment, assume a valid email address has the following pattern
	     * - four parts:
	     * -- Recipient name - made up of uppercase and lowercase letters, digits 0 to 9. Length at least 1, but no more than 32 
	     * -- @ symbol
	     * -- Domain name - made up of uppercase and lowercase letters, digits 0 to 9. Length at least 1, but no more than 32
	     * -- Top-level domain -  either .com or .net or .edu
	     */
	    public static int countNumberOfValidEmailAddresses(String fileDump) {
	    	boolean result2 = Pattern.matches("[a-zA-Z 0-9]{1,32}, [@], [a-zA-Z 0-9]{1,32}, [.com|.net|.edu]", fileDump);
	        return -1;
	    }

}
