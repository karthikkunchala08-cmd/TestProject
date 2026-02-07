package practice_java;

public class Car extends Vehicle{  //Child Class / Sub Class
	
	public void method() {
		System.out.println("From a Method in Car");
	}
	
	 public void honk() {                    // Vehicle method
		    System.out.println("Phonkkkkk");
		  }
	
	public static void main(String[] args) {
		//Car bandi = new Car();//You use the child reference only when you absolutely need a method that only exists in the child class and is not part of the parent's
		Vehicle bandi = new Car();
		bandi.honk();
		System.out.println(bandi.brand);
		//bandi.method();
	}
}
