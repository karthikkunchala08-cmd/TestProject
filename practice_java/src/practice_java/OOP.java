package practice_java;

public class OOP {
	
	int num = 10; //class Attribute
	
	public void sayHello() {  //One of the methods of class
		System.out.println("Heloooo");
	}
	//***********  CONSTRUCTOR ****************
	/*
	A constructor in Java is a special method that is used to initialize objects.
	The constructor is called when an object of a class is created.
	It can be used to set initial values for object attributes
	
	Note that the constructor name must match the class name, and it cannot have a return type (like void).
	Also note that the constructor is called when the object is created.
	All classes have constructors by default: if you do not create a class constructor yourself, 
	Java creates one for you. However, then you are not able to set initial values for object attributes.
	 */
	public OOP(int num) {  //Constructor
	    this.num = num; 
	  }
	
	public static void main(String[] args) {
		/*
		OOP stands for Object-Oriented Programming.
		Procedural programming is about writing procedures or methods that perform operations on the data, 
		while object-oriented programming is about creating objects that contain both data and methods.
		
		Object-oriented programming has several advantages over procedural programming:
		OOP is faster and easier to execute
		OOP provides a clear structure for the programs
		OOP helps to keep the Java code DRY "Don't Repeat Yourself", and makes the code easier to maintain, modify and debug
		OOP makes it possible to create full reusable applications with less code and shorter development time
		Tip: The "Don't Repeat Yourself" (DRY) principle is about reducing the repetition of code. 
		You should extract out the codes that are common for the application, and place them at a single place and reuse them instead of repeating it.
		
		Ex:- If Fruits is a Class, Apple, Banana, Orange are it's Objects.
		So, a class is a template for objects, and an object is an instance of a class.
		When the individual objects are created, they inherit all the variables and methods from the class.
		
		If a class is a Blueprint, an object is an item made using that blueprint. A class contains Attributes and Methods
		 */
		
		OOP object = new OOP(5); 	//syntax to create an Object
		//Accessing this class's Attributes and Methods
		System.out.println("num:- "+object.num);  
		object.sayHello();
		
		//Creating an object of different class
		JavaMethods objectJm = new JavaMethods();
		System.out.println("Sum of First 20 numbers using Recursion:- "+objectJm.addNumbers(20));
		//JavaMethods.addNumbers(20);

	}
	
	
	

}
