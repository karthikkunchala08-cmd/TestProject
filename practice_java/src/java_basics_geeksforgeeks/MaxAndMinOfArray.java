package java_basics_geeksforgeeks;

import java.util.Scanner;

public class MaxAndMinOfArray {
	//input - 2 3 1 6 0 output - MAX - 6, MIN - 0
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the size of Array:- ");
		int arrayLength = scan.nextInt();
		int arr[] = new int[arrayLength];
		System.out.println("Enter Array Numbers:- ");
		for(int i=0; i<arrayLength; i++) {
			arr[i] = scan.nextInt();
		}
		int max,min;
		max = min = 0;
		for(int i=0; i<arrayLength; i++) {
			if(arr[i]>max) {
				max = arr[i];
			}
			if(arr[i]<min) {
				min = arr[i];
			}
		}
		System.out.println("Max:- " +max+" Min:- "+min);
		

	}

}
