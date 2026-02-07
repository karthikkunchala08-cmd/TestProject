package practice_java;

public class Operators {

	public static void main(String[] args) {
		
		
		//**************** OPERATORS *****************
		System.out.println("********* Arithmetic Operators *********");
		System.out.println("\n");
		/*
		+	Addition	Adds together two values	x + y	
		-	Subtraction	Subtracts one value from another	x - y	
		*	Multiplication	Multiplies two values	x * y	
		/	Division	Divides one value by another	x / y	
		%	Modulus	Returns the division remainder	x % y	
		++	Increment	Increases the value of a variable by 1	++x	
		--	Decrement	Decreases the value of a variable by 1	--x
		*/
		
		System.out.println("Addition:- 1+1 = "+(1+1));
		System.out.println("Subtraction:- 2-1 = "+(2-1));
		System.out.println("Multiplication:- 2X2 = "+(2*2));
		System.out.println("Division:- 4/2 = "+(4/2)+" Gives Quotient");
		System.out.println("Modulus:- 4/2 = "+(4%2)+ " Gives Remainder");
		System.out.println("Increment & Decrement Operators Divided into 2 sections, 1. Pre 2. Post");
		System.out.println("These changes occur when assigning to another variable. Ex:- ");
		int num = 3;
		int num2 = 0;
		System.out.println("int num = 3, int num2 = 0");
		num2 = ++num;
		System.out.println("num2 = ++num, Results:- num2 = "+num2+" num = "+num);
		num2 = num++;
		System.out.println("num2 = num++, Results:- num2 = "+num2+" num = "+num);
		//Same with Decrement
		//Run to see the results
		System.out.println("\n");
		System.out.println("********* Assignment Operators *********");
		System.out.println("\n");
		
		/*
		Assignment operators are used to assign values to variables.
		= will Assign a value to any variable
		+= Addition Assignment Operator
		-= Subtraction Assignment Operator
		*= Multiplication Assignment Operator
		/= Division Assignment Operator
		%= Modulus Assignment Operator
		*/
		int a = 2;
		System.out.println("Assignment Operator '=':- int a = 2, a value is:- "+a);
		a += 2;
		System.out.println("Addition Assignment Operator:- a += 2, a value is:- "+a);
		System.out.println("a += 2 is Same as a = a + 2");
		System.out.println("Same with -, *, /, %");
		
		System.out.println("\n");
		System.out.println("********* Comparison Operators *********");
		System.out.println("\n");
		
		System.out.println("Comparison operators are used to  compare two values. The return value of these operators is true/false");
		System.out.println("==, !=, <, >, <=, >=");
		/*
		Comparison operators are used to  compare two values.
		The return value of these operators is true/false
		== Equal to
		!= Not Equal
		< Less Than
		> Grater Than
		<= Less Than or Equal to
		>= Greater Than or Equal to
		*/
		
		System.out.println("\n");
		System.out.println("********* Logical Operators *********");
		System.out.println("\n");
		
		System.out.println("Logical && and, || or, ! not");
		/*
		Logical && and, || or, ! not
		*/
		
	}

}
