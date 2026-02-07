package practice_java;

		// From Java 8, we can implement the methods in interface by adding the keyword default, static or private to the methods.
public interface SampleInterface {
	
	void firstTest(); // This is an Unimplemented Method
	
	default void secondTest() { // This is an Implemented Method
		
	}
	
	static void thirdTest() {
		
	}
	
	private void fourthTest() {
		
	}

}
