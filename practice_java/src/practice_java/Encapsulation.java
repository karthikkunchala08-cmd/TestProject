package practice_java;

public class Encapsulation {
	
	public class Person {
		  private String name; // private = restricted access

		  // Getter
		  public String getName() {
		    return name;
		  }

		  // Setter
		  public void setName(String newName) {
		    this.name = newName;
		  }
		}
	
	public static void main(String[] args) {
		//********** ENCAPSULATION **********
		/*
		 * The meaning of Encapsulation, is to make sure that "sensitive" data is hidden from users. To achieve this, we must:
		declare class variables/attributes as private
		provide public get and set methods to access and update the value of a private variable
		 */
	}

}
