package practice_java;

public class JavaMethods {
	
	/*
	 * A Method/Function is a block of code which only runs when it is called.
	 * You can pass data, known as parameters, into a method.
	 * We use Methods to reuse code: define the code once, and use it many times.
	 * A method must be declared within a class, Example sayHello method declared below
	 */
	
	public static void sayHello() {  	//Method with No Parameters and No Return value
		/*
		 * public - keyword is an access modifier that makes classes, attributes, methods, and constructors 
		 * accessible from any other class in the entire program, regardless of the package they belong to. 
		 * It provides the widest possible scope of access.
		 *  
		 * static - a non-access modifier that indicates a member belongs to the class itself, 
		 * rather than to any specific instance (object) of that class. 
		 * If a method is static we can directly call it from any other method by using it's class name and it's name ex:- JavaMethods.myMethod.
		 * 
		 * void - a keyword used in method declarations to specify that the method does not return any value to the caller
		 */
		
		System.out.println("Hello World!");
		
	}
	
	public static void sayHelloWithName(String name) {		//Method with Parameters and No Return value
		System.out.println("Hello "+name);
		//The data which we are receiving while calling a method are called parameters, ex:- name
	}
	
	public static String trimTheName(String name) {		//Method with Parameters and Return value
		System.out.println("Removing the Extra Spaces");
		return name.trim();
	}
	
	public static void main(String[] args) {
		sayHello();
		String name = "     Angulimala     ";
		System.out.println("Name:- "+name);
		name = trimTheName(name);
		sayHelloWithName(name);
		//The data which we are passing while calling a method is called attributes, ex:- name
		System.out.println("Sum of First 5 numbers using Recursion:- "+addNumbers(5));
		
	}
	//METHOD OVERLOADING
	/*
	 * With method overloading, multiple methods can have the same name with different parameters
	 * Multiple methods can have the same name as long as the number and/or type of parameters are different.
	 * Ex:- sayHello(), sayHello(String name), sayHello(String name, int age)
	 */
	
	//RECURSION
	/*
	 * Recursion is the technique of making a function call itself.
	 * This technique provides a way to break complicated problems down into simpler problems which are easier to solve.
	 */
	public static int addNumbers(int n) {
		if(n==1) {
			return n;
		}
		return n+addNumbers(n-1);
	}

}
