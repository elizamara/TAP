// Java code to illustrate get() method
import java.util.*;

public class teste {
public static void main(String args[]) {

	// Creating an empty LinkedList
	LinkedList<String> list = new LinkedList<String>();

	// Use add() method to add elements in the list
	list.add("Geeks");
	list.add("for");
	list.add("Geeks");
	list.add("10");
	list.add("20");

	// Displaying the list
	System.out.println("LinkedList:" + list);
		
	// Fetching the specific element from the list
	System.out.println("The element is: " + list.get(3));

}
}
