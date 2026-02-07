package practice_java;

import java.util.ArrayList;

public class DataTypes {

	public static void main(String[] args) {
		
		/*
		****************** PRIMITIVE DATA TYPES ****************
		
		byte - Stores whole numbers from -128 to 127
		short - Stores whole numbers from -32,768 to 32,767
		int - stores integers (whole numbers) from -2,147,483,648 to 2,147,483,647, without decimals, such as 123 or -123
		long - Stores whole numbers from -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807, Note that you should end the value with an "L"
		float - stores floating point numbers, with decimals, such as 19.99 or -19.99, sufficient for storing 6 to 7 decimal digits, Note that you should end the value with an "f"
		double -  stores floating point numbers, with decimals, such as 19.99 or -19.99, sufficient for storing 15 to 16 decimal digits, Note that you should end the value with an "d"
		String - stores text, such as "Hello". String values are surrounded by double quotes. Actually String is an object of a class not a Primitive Data Type
		, as it is used very widely it is also included in this list.
		char - stores single characters, such as 'a' or 'B'. Char values are surrounded by single quotes,
		, if we are familiar with ASCII values, we can use those to display certain characters
		boolean - stores values with two states: true or false
		
		final keyword - A variable declared with final becomes a constant, which means unchangeable and read-only:
		 */
		
		byte a = 127;  //Max limit is 127
		short b = 32767;  //Max limit is 32767
		int c = 2147483647;  //Max limit is 2147483647
		long d = 9223372036854775807L;  //Max limit is 9223372036854775807 Note that you should end the value with an "L"
		final float e = 3.1456786f; //Max 6-7 decimal points are allowed, value gets rounded to the same nearest representable float value.
		double f = 2.12345678912345d; //Max 15-16 decimal points are allowed, value gets rounded to the same nearest representable float value.
		String g = "string"; //String values are surrounded by double quotes
		char h = 'c'; //Stores single characters, Char values are surrounded by single quotes
		char i = 65; //ASCII value to print a character
		boolean j = true; //stores values with two states: true or false
		
		System.out.println("******** PRINTING VARIABLES AFTER DECLARING IN THE OLD WAY *******");
		System.out.println("byte:- "+a);
		System.out.println("short:- "+b);
		System.out.println("int:- "+c);
		System.out.println("long:- "+d);
		System.out.println("float:- "+e);
		System.out.println("double:- "+f);
		System.out.println("String:- "+g);
		System.out.println("char:- "+h);
		System.out.println("char ASCII:- "+i);
		System.out.println("boolean:- "+j);
		
		System.out.println("\n");
		
		/*
		 ************** VAR KEYWORD *************
		The var keyword lets the compiler automatically detect the type of a variable based on the value you assign to it.
		This helps you write cleaner code and avoid repeating types, especially for long or complex types.
		
		var only works when you assign a value at the same time (you can't declare var x; without assigning a value):
		var x; is wrong
		var x = 2.1f; is Okay
		 */
		
		var aVar = 127;  
		var bVAr = 32767;  
		var cVAr = 2147483647;  
		var dVAr = 9223372036854775807L;  
		final var eVAr = 3.1456786f; 
		var fVAr = 2.12345678912345d; 
		var gVAr = "string"; 
		var hVAr = 'c'; 
		var iVAr = 67; //NOTE - in this case it is considering it as a number.
		var jVAr = true; 
		
		System.out.println("******** PRINTING VARIABLES AFTER DECLARING IN THE NEW VAR WAY *******");
		System.out.println("byte:- "+aVar);
		System.out.println("short:- "+bVAr);
		System.out.println("int:- "+cVAr);
		System.out.println("long:- "+dVAr);
		System.out.println("float:- "+eVAr);
		System.out.println("double:- "+fVAr);
		System.out.println("String:- "+gVAr);
		System.out.println("char:- "+hVAr);
		System.out.println("char ASCII:- "+iVAr);
		System.out.println("boolean:- "+jVAr);
		/*
		For more complex types, such as ArrayList or HashMap, var can make the code shorter and easier to read
		 */
		
		// Without var
		ArrayList<String> cars = new ArrayList<String>();

		// With var
		var carss = new ArrayList<String>();
		
		int ff = 0;
		ff=5/2;
		System.out.println("ff:- "+ff);
		
		//******************************************************************************
		
		//******************************* TYPE CASTING ************************
		
		/*
		 * Widening Casting (automatic) - converting a smaller type to a larger type size
			byte -> short -> char -> int -> long -> float -> double

			Narrowing Casting (manual) - converting a larger type to a smaller type size
			double -> float -> long -> int -> char -> short -> byte
		 */
		
		//Widening
		int number1 = 3;
		double number2 = number1; //Automatic
		
		//Narrowing
		double number3 = 3.14;
		int number4 = (int) number3; //Manual, this manual conversion is required because narrowing may result in data loss (for example, dropping decimals when converting a double to an int):
		
		

	}

}
