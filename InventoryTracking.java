//Talla Mohmmed-Ahmmed
//Assignment 4
//08-20-22
import java.util.Scanner; //import scanner class
import java.text.*; //import currency class

public class InventoryTracking {
	public static void main(String[] args) {
		//User Input: Product
		float stock = 10; //declare stock number
		float x; //declare var
		System.out.println("Thank you for Shopping with Fancy Florals!");
		Scanner myO[bj = new Scanner(System.in); //create scanner
		System.out.println("Pick a bouquet size - Mini, Regular, or Jumbo: ");
		String product = myObj.next(); //set the product variable 
		
		//User Input: Product Quantity
		Scanner mySecondObj = new Scanner(System.in); //create new scanner
		System.out.println("Please select the number of " + product + " bouquets: ");
		float productQuantity = myObj.nextFloat(); //set it to variable
		float money; //declare money variable
		money = (productQuantity * 7); //set money value
		DecimalFormat decFormat = new DecimalFormat("$#,###.00");//declare currency format
		
		
		//If Statements
		if (productQuantity < 10) { //if user orders less than 10 
			System.out.println("You have requested " + productQuantity+ " of " + product + " bouquets.");
			System.out.println("Your total is: ");
			System.out.println(decFormat.format(money)); 
			x = (stock - productQuantity);
			System.out.println("There are " + x + " units remaining in stock.");}
			
			
		 if (productQuantity == 10) { //if user orders 10
			System.out.println("We have 10 units of " + product + " bouquets");
			System.out.println("Your total is: ");
			System.out.println(decFormat.format(money)); }
		 
		if (productQuantity > 10) {
			System.out.println("The number of units requested," + productQuantity + ", is not currently in stock. Please try ordering your" + product + " bouquets when supplies are in stock");

		}
	}
}
