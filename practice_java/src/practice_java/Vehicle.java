package practice_java;

public class Vehicle { //Parent Class / Super Class
	
	// ****** INHERITANCE ********
	/*
	In Java, it is possible to inherit attributes and methods from one class to another. We group the "inheritance concept" into two categories:
	subclass (child) - the class that inherits from another class
	superclass (parent) - the class being inherited from
	To inherit from a class, use the 'extends' keyword.
	 */
	
	protected String brand = "Ford";   // Vehicle attribute
	
	  public void honk() {                    // Vehicle method
	    System.out.println("Tuut, tuut!");
	  }
}
