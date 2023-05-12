/*Talla Mohmmed-Ahmmed
 * Final Project
 * 11/19/22
 */
import java.util.Scanner;//import class
class Products{//create class
	//class attributes
	private String product1Name="Mini";
	private String product2Name="Regular";
	private String product3Name="Jumbo";
	private String product4Name="Vase";
	//model
	public Products(String str1, String str2, String str3, String str4) {
		
	}
	//setter methods
	public void setProduct1Name(String newName) {
		product1Name = newName;
	}
	public void setProduct2Name(String newName) {
		product2Name = newName;
	}
	public void setProduct3Name(String newName) {
		product3Name = newName;
	}
	public void setProduct4Name(String newName) {
		product4Name = newName;
	}
}

public class BusinessManagment {

	public static void main(String[] args) {
		int x = 1;//dec var
		while(x==1) {
		//opening menu
			System.out.println("                * * *");
			System.out.println("          *   *       *");
			System.out.println("     *  *   *    * *       *");
			System.out.println("    *  *   *   *        *    *");
			System.out.println("   *  *   *   *    * *    *    *");
			System.out.println("  *   *   *  *   *     *    *   *");
			System.out.println("* *    *      *     *   *    *   *");
			System.out.println("*  *    *       * *    *      *  *");
			System.out.println("**  *     * *        *        *  *");
			System.out.println("* *  *       *     *         *  *");
			System.out.println("*  *   *****     *          *  *");
			System.out.println(" *   *      *  *          *    *");
			System.out.println(" *     *      *         *      *");
			System.out.println(" *       *     *      *        *");
			System.out.println(" *        *     *   *          *");
			System.out.println(" *          *   * *            *");
			System.out.println("  *          *   *            *");
			System.out.println("   *         *  *            *");
			System.out.println("    *        *  *           *");
			System.out.println("      *     *    *        *");
			System.out.println("        * * * * * * * * *");
			System.out.println("          * * * * * * *");
			System.out.println("            * * * * *");
			System.out.println("              * * *");
			System.out.println("                *");
			System.out.println("                *");
			System.out.println("                *");
			System.out.println("                *");
			System.out.println("                *>");
			System.out.println("                *         * *");
			System.out.println("                *       *    *");
			System.out.println("               <*     *     *");
			System.out.println("                *    *     *");
			System.out.println("                *   *     *");
			System.out.println("                *  *    *");
			System.out.println("                * *   *");
			System.out.println("                **  *");
			System.out.println("                * *");
			System.out.println("                *");
			System.out.println("                *");
			System.out.println("Welcome to Fancy Florals!");
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
		int[][] itemsInventory = new int[4][2];
		itemsInventory [0][0]= 1;
		itemsInventory [0][1]= 1000;
		itemsInventory [1][0]= 2;
		itemsInventory [1][1]= 2993;
		itemsInventory [2][0]= 3;
		itemsInventory [2][1]= 4993;
		itemsInventory [3][0]= 4;
		itemsInventory [3][1]= 703;
		if (x==1) { //inventory action
			Scanner input2 = new Scanner(System.in);
			System.out.println("Press 1 to view Fancy Florals inventory, 2 to add an item, 3 to change the name of an item");
			int option2 = input2.nextInt();
			if (option2==1) {
				viewInventory(itemsInventory);}
			else if(option2==2) {
				Scanner input = new Scanner(System.in);
				System.out.println("What is the name of the product you wish to add?");
				String newName = input.nextLine();
				addProduct(newName);
			}
			else if(option2==3) {
				
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
	//view inventory
	public static void viewInventory(int[][] array) {
		for (int k = 0; k < 4; k++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(array[k][j] + " ");
            }
 
            System.out.println();
        }	}
	//add product
	public static void addProduct(String newName) {
		String[] itemsNames = new String[5];
		itemsNames [0]= "Mini";
		itemsNames [1]= "Regular";
		itemsNames [2]= "Jumbo";
		itemsNames [3]= "Vase";
		Scanner input = new Scanner(System.in);
		System.out.println("Select Name of New Product");
		newName = input.nextLine();
		itemsNames[4] = newName;
		for (int k = 0; k < 4; k++) {
			System.out.print(itemsNames[k]+ " ");
            }
	}
	//change product
	public static void changeProduct(String newName) {
		String[] itemsNames = new String[4];
		itemsNames [0]= "Mini";
		itemsNames [1]= "Regular";
		itemsNames [2]= "Jumbo";
		itemsNames [3]= "Vase";
		Scanner input = new Scanner(System.in);
		System.out.println("Select product to change of New Product: 1, 2, 3, or 4: ");
		int whichItem = input.nextInt();
		if (whichItem==1) {
			itemsNames[0] = newName;
		}
		else if (whichItem==2) {
			itemsNames[1] = newName;
		}
		else if (whichItem==3) {
			itemsNames[2] = newName;
		}
		else if (whichItem==4) {
			itemsNames[3] = newName;
		}
	}
	
	
	//sales action subgroup method
	public static void purchaseProducts() {
		int[][] itemsInventory = new int[4][2];
		itemsInventory [0][0]= 1;
		itemsInventory [0][1]= 1000;
		itemsInventory [1][0]= 2;
		itemsInventory [1][1]= 2993;
		itemsInventory [2][0]= 3;
		itemsInventory [2][1]= 4993;
		itemsInventory [3][0]= 4;
		itemsInventory [3][1]= 703;
		System.out.println("Mini Bouquet- $6.15");
		System.out.println("Regular Bouquet - $11.20");
		System.out.println("Jumbo Bouquet - $17.34");
		System.out.println("Vase - 16.50");
		Scanner input = new Scanner(System.in); //get user input
        System.out.println("Pick A boquet size: Mini(1), Regular(2), Jumbo(3), Vase(4):  ");
        int item = input.nextInt(); //read user input
        System.out.println("Now pick an amount of item(s): "); //sample user choice
        int bouquetNumber = input.nextInt();
        //if item in out of stock
        if ((item== 1) && ((itemsInventory[0][1])>bouquetNumber)) {
        	System.out.println("Item is out of stock");
        }
        else if ((item== 2) && ((itemsInventory[1][1])>bouquetNumber)) {
        	System.out.println("Item is out of stock");
        }
        else if ((item== 3) && ((itemsInventory[2][1])>bouquetNumber)) {
        	System.out.println("Item is out of stock");
        }
        else if ((item== 4) && ((itemsInventory[4][1])>bouquetNumber)) {
        	System.out.println("Item is out of stock");
        }
        else {
        System.out.println(bouquetNumber + " " + item + " " +  "is your order");
        }
	}

}


