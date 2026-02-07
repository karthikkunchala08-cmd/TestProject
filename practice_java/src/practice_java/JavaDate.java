package practice_java;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class JavaDate {
	// Java does not have a built-in Date class, but we can import the java.time package to work with the date and time API. 
	//The package includes many date and time classes.
	
	/*Like
	 * LocalDate	Represents a date (year, month, day (yyyy-MM-dd))
		LocalTime	Represents a time (hour, minute, second and nanoseconds (HH-mm-ss-ns))
		LocalDateTime	Represents both a date and a time (yyyy-MM-dd-HH-mm-ss-ns)
		DateTimeFormatter	Formatter for displaying and parsing date-time objects, use .ofPattern() to specify the pattern
		Ex:- dd-MM-yyyy HH:mm:ss, use .format() to include the format to the specific object
	 */
	public static void main(String[] args) {
		LocalDate lD = LocalDate.now();
		System.out.println(lD);
		
		LocalTime lT = LocalTime.now();
		System.out.println(lT);
		
		LocalDateTime lDT = LocalDateTime.now();
		System.out.println(lDT);
		
		DateTimeFormatter dTF =  DateTimeFormatter.ofPattern("HH:mm:ss  dd-MM-yyyy");
		System.out.println(lDT.format(dTF));
	}

}
