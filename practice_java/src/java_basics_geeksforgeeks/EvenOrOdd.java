package java_basics_geeksforgeeks;

import java.util.Scanner;

public class EvenOrOdd {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a Number:- ");
		var number = scan.nextInt();
		
		//Naive Approach
		if(number%2==0) {
			System.out.println(number+" is an Even Number");
		}
		else {
			System.out.println(number+" is an Odd Number");
		}
		
		//Efficient Approach
		if((number&1)==0) {
			System.out.println(number+" is an Even Number");
		}
		else {
			System.out.println(number+" is an Odd Number");
		}

	}

}
