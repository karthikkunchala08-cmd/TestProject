package practice_java;

public class Arrays {

	public static void main(String[] args) {
		/*
		Arrays are used to store multiple values in a single variable, instead of declaring separate variables for each value.
		To declare an array, define the variable type with square brackets [ ]
		 */
		
		//If we know the values while declaring
		String[] cars1 = {"Volvo", "BMW", "Ford", "Mazda", "Tata"};
		
		//If we don't know the values while declaring
		String[] cars2 = new String[5];
		cars2[0] = "Volvo";
		cars2[1] = "BMW";
		cars2[2] = "Ford";
		cars2[3] = "Mazda";
		cars2[4] = "Tata";
		
		System.out.println(cars1.length); //length of array
		
		//Printing Arrays
		System.out.println(cars1); //wrong way
		for(String car : cars1) {
			System.out.println(car);
		}
		// The for-each loop is great when you only need to read elements. 
		//If you want to change the elements later, or keep track of their index, use a regular for loop instead.

	}

}
