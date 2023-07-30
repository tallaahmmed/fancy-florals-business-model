/*Midterm Project
 * Talla Mohmmed-Ahmmed
 * 10/18/22
 */
import java.util.Scanner; //import scanner class

public class EmployeeMenu {

	public static void main(String[] args) {
		int x = 1;//dec var
		while(x==1) {
		
		//opening menu
			System.out.println("Welcome, Fancy Florals Employee!");
			Scanner input = new Scanner(System.in); // declare scanner 
			System.out.println("Select an Option:");
			System.out.println("1 - Inventory Actions");
			System.out.println("2 - Sales Actions");
			System.out.println("3 - Exit");
			int option1 = input.nextInt();
			topLevelMenu(option1);}
			} 
	
	//top level menu method
	public static void topLevelMenu(int x) {
		if (x==1) { //inventory action
			Scanner input2 = new Scanner(System.in);
			System.out.println("Press 1 to view Fancy Florals inventory");
			int option2 = input2.nextInt();
			if (option2==1) {
				viewInventory();}
			else {
				System.out.println("goodbye!");
			}
			
		}
		else if (x==2){//sales action
			Scanner input2 = new Scanner(System.in);
			System.out.println("Press 1 to purchase Fancy Floral products");
			int option3 = input2.nextInt();
			if (option3==1) {
				purchaseProducts();}
			else{
				System.out.println("goodbye!");}
			}
		else if (x==3) {//exit
			System.out.println("Have a nice day!");
		}
		
	}
	//inventory action subgroup method
	public static void viewInventory() {
		System.out.println("placeholder");
	}
	//sales action subgroup method
	public static void purchaseProducts() {
		System.out.println("placeholder");
	
	
	}}


