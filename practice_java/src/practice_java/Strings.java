package practice_java;

public class Strings {

	public static void main(String[] args) {
		System.out.println("**********   STRINGS ***********");
		System.out.println("A String variable contains a collection of characters surrounded by double quotes (\"\"):");
		String str = "Text";
		System.out.println("Example:- String str = \"Text\", String str Value = "+str);
		System.out.println("\n");
		System.out.println("****** STRING METHODS ********");
		System.out.println("length() gives Length of the String. Example:- str.length() = "+ str.length());
		System.out.println("toUpperCase() Coverts the String to Uppercase. Example:- str.toUpperCase() = "+ str.toUpperCase());
		System.out.println("toLowerCase() Coverts the String to Lowercase. Example:- str.toLowerCase() = "+ str.toLowerCase());
		System.out.println("indexOf() returns the index (the position) of the first occurrence of a specified text in a string. Example:- str.indexOf('t') = "+ str.indexOf('t'));
		System.out.println("charAt() to access a character at a specific position in a string. Example:- str.charAt(1) = "+ str.charAt(1));  
		System.out.println("equals() to compare two strings, returns true or false. Example:- str.equals(\"java\") = "+ str.equals("java")); 
		str = "     Text     ";
		System.out.println("Make str = \"     Text     \" str value:- "+ str);
		System.out.println("trim() to remove whitespace from the beginning and the end of a string. Example:- str.trim() = "+ str.trim());  
		System.out.println("'+' to Concatenate two Strings. Example:- str+\" Editor\" = "+ str.trim()+" Editor");  	
	}

}