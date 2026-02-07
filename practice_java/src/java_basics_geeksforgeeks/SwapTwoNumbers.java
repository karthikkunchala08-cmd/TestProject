package java_basics_geeksforgeeks;

import java.util.Scanner;

public class SwapTwoNumbers {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter two Numbers:- ");
		var number1 = scan.nextInt();
		var number2 = scan.nextInt();
		
		System.out.println("Initial - Number 1:- "+number1+", Number 2:- "+number2);
		
		number2 = number1+number2;
		number1 = number2 - number1;
		number2 = number2 - number1;

		System.out.println("After Swapping - Number 1:- "+number1+", Number 2:- "+number2);
	}

}
