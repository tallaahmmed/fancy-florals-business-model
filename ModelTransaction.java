/*Talla Mohmmed-Ahmmed
 * Assignment 2b
 * 07-26-22
 */
import java.util.Scanner; //import the scanner class
public class ModelTransaction {
	public static void main(String[] args) {
		//Variable 1
		System.out.println("Welcome to Fancy Florals!");
        Scanner bouquetSize = new Scanner(System.in); //get user input
        System.out.println("Pick A boquet size: Mini, Regular, Jumbo: ");
        String bouquetSizestr = bouquetSize.nextLine(); //read user input
        System.out.println("Size picked: " + bouquetSizestr); //print
        
        //Variable 2
        System.out.println("Now pick an amount of bouquet(s): 2 Selected"); //sample user choice
        int bouquetNumber = 2;
        System.out.println(bouquetNumber + " " + bouquetSizestr + " " +  "is your order");
        
        //Variable 3
        System.out.println("What colour would you like? ");
        String bouquetColor="Yellow";//sample user choice
        System.out.println("You chose" + " " + bouquetColor + "flowers");
        
        System.out.println("Thank you for shopping with Fancy Florals!");
        double finalOrder = 12.56; //sample price
        System.out.println("Your final price is " + finalOrder);
        
        
	}

}
