package practice_java;

public class Loops {

	public static void main(String[] args) {
		/*
		 * Loops can execute a block of code as long as a specified condition is true.
		 * while, do-while, for, for each
		 */

		System.out.println("while loop will run until the specified condition is true, stops once the condition fails");
		int i=0;
		while(i<5) {
			System.out.println(i);
			i++;
		}
		//Note: Do not forget to increase the variable used in the condition (i++), otherwise the loop will never end!
		
		System.out.println("\t");
		System.out.println("do-while loop will execute the code block once, before checking if the condition is true. "
				+ "Then it will repeat the loop as long as the condition is true.");
		do {
			System.out.println(i);
			i++;
		}
		while(i<10);
		
		System.out.println("\t");
		System.out.println("We can use for loop when we know exactly how many times we want to loop through a block of code");
		for(int j=0; j<5; j++) {
			System.out.println(j);
		}
		
		System.out.println("\t");
		System.out.println("for-each loop to loop through elements in an array/list");
		String [] cars = {"volvo", "bmw", "tata", "audi", "benz", "honda", "hyndai", "toyota", "suzuki", "byd"};
		for(String car : cars) {
			System.out.println(car);
		}
		
		
		//break = stop the loop completely.
		//continue = skip this round, but keep looping.
	}

}
