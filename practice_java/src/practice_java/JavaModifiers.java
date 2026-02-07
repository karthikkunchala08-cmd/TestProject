package practice_java;

public class JavaModifiers {

	public static void main(String[] args) {
		
		//********** ACCESS MODIFIERS ************
		/*
		 * Access Modifiers - controls the access level
		 * 
		 * For Classes we can use public
		 * For Attributes, Methods, Constructors
		 * public	The code is accessible for all classes	
		 * private	The code is only accessible within the declared class
		 */
		
		//*********** NON ACCESS MODIFIERS **********
		/*
		 * Non-access modifiers do not control visibility (like public or private), 
		 * but instead add other features to classes, methods, and attributes.
		 * The most commonly used non-access modifiers are final, static, and abstract.
		 */
		
		final int num = 5; //Declare attributes as final, if you don't want the ability to override existing attribute value.
		
		
		
	}
	
	static void method() { //A static method belongs to the class, not to any specific object. 
							//This means you can call it without creating an object of the class.
	}
		
	}						
