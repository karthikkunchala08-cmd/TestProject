package java_basics_geeksforgeeks;

import java.util.Scanner;

public class ReverseAnArray {
	//input - 12345 output - 54321

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the size of Array:- ");
		int arrayLength = scan.nextInt();
		int arr[] = new int[arrayLength];
		System.out.println("Enter Array Numbers:- ");
		for(int i=0; i<arrayLength; i++) {
			arr[i] = scan.nextInt();
		}
		System.out.println("Original Array:- ");
		for(int i=0; i<arrayLength; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println("\b");
		System.out.println("Reversed Array:- ");
		for(int i=(arrayLength-1); i>=0; i--) {
			System.out.print(arr[i]+" ");
		}
		
	}

}
