package java_basics_geeksforgeeks;

import java.util.Scanner;

public class SumOfTheDigits {
		//INPUT - 125 OUTPUT - 8 1+2+5 = 8
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a Number:- ");
		var number = scan.nextInt();
		
		
//		int num, rem, rev;
//		rem = 0;
//		rev = 0;
//		num = number;
//		while(num!=0) {
//			rem = num%10;
//			rev = rev*10+(rem);
//			num = num/10;
//		}
//		
//		System.out.println("Reverse Number:- "+rev);
		System.out.println("Reverse Number:- "+sum(number));

	}
	
	public static int sum(int n) {
		
		if(n==0) {
			return 0;
		}
		return (n%10) + sum(n/10);
	}

}
