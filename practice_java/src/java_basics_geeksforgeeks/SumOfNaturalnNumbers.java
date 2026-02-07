package java_basics_geeksforgeeks;

import java.util.Scanner;

public class SumOfNaturalnNumbers {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a Number:- ");
		var number = scan.nextInt();
		
		//Naive Approach
		var sum = 0;
		for(int i=1; i<=number; i++) {
			sum += i;
		}
		System.out.println("Sum of "+number+" Natural Numbers:- "+sum);
		
		//Efficient Approach
		System.out.println("Sum of "+number+" Natural Numbers:- "+number*(number+1)/2);
	}

}
