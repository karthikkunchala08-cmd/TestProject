package java_basics_geeksforgeeks;

import java.util.Scanner;

public class SumOfSquares {
		//INPUT - 2 OUTPUT - 5 - 1^1+2^2 = 5
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a Number:- ");
		var number = scan.nextInt();
		var sos = 0;
		for(int i=1; i<=number; i++) {
			sos += i*i; 
		}
		System.out.println("Sum Of Squares:- "+sos);

	}

}
