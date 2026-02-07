package practice_java;

public class ConditionalStatements {
	public static void main(String[] args) {
		/*
		 Use if to specify a block of code to be executed, if a specified condition is true
		 Use else to specify a block of code to be executed, if the same condition is false
		 Use else if to specify a new condition to test, if the first condition is false
		 Use switch to specify many alternative blocks of code to be executed
		 */
		int num = 5;
		if(num>1) {
			System.out.println("Number is Greater than 1");
		}
		else if(num>5) {
			System.out.println("Number is Greater than 5");
		}
		else {
			System.out.println("Number is Not Greater than 5");
		}
		
		//Ternary Operator, Syntax:- variable = (condition) ? expressionTrue :  expressionFalse;
		boolean status = (num>4) ? true : false;
		System.out.println(status);
		
		int time = 20;
		String result = (time < 18) ? "Good day." : "Good evening.";
		System.out.println(result);
		
		switch(num) {
		
		case 1:
			System.out.println("Number is 1");
			break;
		case 5:
			System.out.println("Number is 5");
			break;
		case 10:
			System.out.println("Number is 10");
			break;
		default:
			System.out.println("Number is Not 1, 5, 10");
		}
		
		
	}
}
