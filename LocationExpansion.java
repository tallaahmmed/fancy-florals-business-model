/* Talla Mohmmed-Ahmmed
 * Assignment 9
 * 11/9/22
 */
import java.util.Scanner; //import scanner class

public class LocationExpansion {
	public static void writeLocationNames(String[] array) {
		String strs[] = array;
	    StringBuilder appendMethod = new StringBuilder();
	    appendMethod.append(strs[0]);
	    appendMethod.append(" "+strs[1]);
	    appendMethod.append(" "+strs[2]);
	    appendMethod.append(" "+strs[3]);
	    appendMethod.append(" "+strs[4]);
	    String list = appendMethod.toString();
	    System.out.println(list);
		
	}

	public static void main(String[] args) {
		System.out.println("Hello! Use this program to help Fancy Florals identify four possible office locations and determine their viability.");
		Scanner input = new Scanner(System.in); //create new Scanner
		String[] locations = new String[4]; //create new string array
		//iteration
		System.out.println("Are any locations farther than 800 miles or closer than 100 miles? Press 1 for No or 2 for Yes: ");
		int distance = input.nextInt();
		if (distance==2) {
			System.out.println("This distance is invalid");
			}
		else if(distance==1) {
			for (int k = 0; k < 5; k++) {
				System.out.println("Enter Location Name: ");
				String name = input.nextLine();
				StringBuilder locationName = new StringBuilder(name); //create a new StringBuilder
				if (locationName.length() > 15) {
					System.out.println("Name must be less than 15 characters, try again: ");
					name = input.nextLine();
					locations[k] = name;}
				else{ 
					locations[k] = name;}
			
		}
		}
		writeLocationNames(locations);
	}	
}
			
		

	


