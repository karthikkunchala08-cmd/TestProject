package java_basics_geeksforgeeks;

import java.util.Scanner;

public class PalindromeValidationString {
	//INPUT - TENET  OUTPUT - YES, INPUT - MOON  OUTPUT - NO
	public static void main(String args[]) {
		System.out.println("Enter a Text:- ");
		Scanner scan = new Scanner(System.in);
		String text = scan.next();
		int stringLength = text.length();
		int flag = 0;
		for(int i=0; i<stringLength/2; i++) {
			if(text.charAt(i)==(text.charAt(stringLength-(i+1)))) {
				flag = 1;
			}
			else {
				flag = 0;
				break;
			}
		}
		if(flag==1) {
			System.out.println("Text:- "+text+" is a Palindrome");
		}
		else {
			System.out.println("Text:- "+text+" is a Not Palindrome");
		}
	}
}
	
	
