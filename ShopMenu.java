/*Talla Mohmmed-Ahmmed
 * Assignment 5
 * 08/26/22
 */
import java.util.Scanner; //import scanner class

public class ShopMenu {
	public static void main(String[] args) {
		//print logo / welcome message 
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
		System.out.println("Welcome to Fancy Florals! ");
		
		//print item menu
		System.out.println("Product Menu: ");
		System.out.println("1: Mini Bouquet - $9.80");
		System.out.println("2: Regular Bouquet - $13.44");
		System.out.println("3: Jumbo Bouquet - $21.09");
		System.out.println("4: Flower Vase - 16.75");
		
		//User Input
		Scanner myObj = new Scanner(System.in); //declare scanner
		System.out.println("Pick a product");
		double product1 = myObj.nextDouble(); //set the product variable 
		
		//If Product 1
		if (product1 == 1) {
			double price1 = 9.80; //set price
			Scanner myObj2 = new Scanner(System.in);//create new obj
			System.out.println("How many Mini Bouquets would you like?");
			double quantity1 = myObj2.nextDouble();//dec quantity var
			price1 = (price1 * quantity1);//set price
			System.out.println(quantity1 + product1 + "has been addded to cart");
			
			//Second Product?
			Scanner myObj3 = new Scanner(System.in);
			System.out.println("Would you like to pick a second item? Click 1 for YES and 2 for NO");
			int yesOrNo = myObj3.nextInt();
			
			if (yesOrNo == 1) {//if yes
				System.out.println("Product Menu: ");
				System.out.println("1: Mini Bouquet - $9.80");
				System.out.println("2: Regular Bouquet - $13.44");
				System.out.println("3: Jumbo Bouquet - $21.09");
				System.out.println("4: Flower Vase - 16.75");
				Scanner myOptionalObj = new Scanner(System.in);
				System.out.println("Pick a product");
				double product2 = myObj.nextDouble(); //set the product variable
				
				if (product2 == 1) {//if yes + product 1
					double price11 = 9.80;
					Scanner myOptionalObj2 = new Scanner(System.in);
					System.out.println("How many Mini Bouquets would you like?");
					double quantity2 = myOptionalObj2.nextDouble();
					price11 = (price11 * quantity2);
					System.out.println(quantity2 + product2 + "has been addded to cart");
					System.out.println("Your total is" + (price11 + price11));
					Scanner myOptionalObj3 = new Scanner(System.in);
					// if yes + product 
					System.out.println("Would you like to proceed with the transaction? Click 1 for YES and 2 for NO");//procced?
					int proceedOrNo = myOptionalObj3.nextInt();
					
					if (proceedOrNo == 1) {// if yes + product 1 + yes
						System.out.println("Thank you for shopping with Fancy Florals!");
						
					}else {//if yes + product 1 + no
						System.out.println("I am sorry we could not provide you with any products today. Please check back when you are ready to purchase.");
					
				}}else if (product2 == 2) { //if yes + product 2
					double price12 = 13.44;
					Scanner myOptionalObj2 = new Scanner(System.in);
					System.out.println("How many Regular Bouquets would you like?");
					double quantity2 = myOptionalObj2.nextDouble();
					price12 = (price12 * quantity2);
					System.out.println(quantity2 + product2 + "has been addded to cart");
					System.out.println("Your total is" + (price1 + price12));
					Scanner myOptionalObj3 = new Scanner(System.in);
					
					System.out.println("Would you like to proceed with the transaction? Click 1 for YES and 2 for NO");
					int proceedOrNo = myOptionalObj3.nextInt();
					
					if (proceedOrNo == 1) {
						System.out.println("Thank you for shopping with Fancy Florals!");
						
					}else {
						System.out.println("I am sorry we could not provide you with any products today. Please check back when you are ready to purchase.");}
				}else if (product2 == 3) { // if yes + product 3
					double price13 = 21.09;
					Scanner myOptionalObj2 = new Scanner(System.in);
					System.out.println("How many Jumbo Bouquets would you like?");
					double quantity2 = myOptionalObj2.nextDouble();
					price13 = (price13 * quantity2);
					System.out.println(quantity2 + product2 + "has been addded to cart");
					System.out.println("Your total is" + (price1 + price13));
					Scanner myOptionalObj3 = new Scanner(System.in);
					
					System.out.println("Would you like to proceed with the transaction? Click 1 for YES and 2 for NO");
					int proceedOrNo = myOptionalObj3.nextInt();
					
					if (proceedOrNo == 1) {
						System.out.println("Thank you for shopping with Fancy Florals!");
						
					}else {
						System.out.println("I am sorry we could not provide you with any products today. Please check back when you are ready to purchase.");}
					
				}else if (product2 == 4) { // if yes + product 4
					double price14 = 16.75;
					Scanner myOptionalObj2 = new Scanner(System.in);
					System.out.println("How many Vases would you like?");
					double quantity2 = myOptionalObj2.nextDouble();
					price14 = (price14 * quantity2);
					System.out.println(quantity2 + product2 + "has been addded to cart");
					System.out.println("Your total is" + (price1 + price14));
					Scanner myOptionalObj3 = new Scanner(System.in);
					
					System.out.println("Would you like to proceed with the transaction? Click 1 for YES and 2 for NO");
					int proceedOrNo = myOptionalObj3.nextInt();
					
					if (proceedOrNo == 1) {
						System.out.println("Thank you for shopping with Fancy Florals!");
						
					}else {
						System.out.println("I am sorry we could not provide you with any products today. Please check back when you are ready to purchase.");}
				
			
					}}else {
				System.out.println("Your total is" + (price1));
				Scanner myObj4 = new Scanner(System.in);
				
				System.out.println("Would you like to proceed with the transaction? Click 1 for YES and 2 for NO");
				int proceedOrNo = myObj4.nextInt();
				
				if (proceedOrNo == 1) {
					System.out.println("Thank you for shopping with Fancy Florals!");
					
				}else {
					System.out.println("I am sorry we could not provide you with any products today. Please check back when you are ready to purchase.");
				}}
			
			
			
			if(product1==2) {
				double price2 = 13.44; //set price
				Scanner myObj22 = new Scanner(System.in);//create new obj
				System.out.println("How many Mini Bouquets would you like?");
				double quantity2 = myObj22.nextDouble();//dec quantity var
				price2 = (price2 * quantity2);//set price
				System.out.println(quantity2 + product1 + "has been addded to cart");
				
				//Second Product?
				Scanner myObj33 = new Scanner(System.in);
				System.out.println("Would you like to pick a second item? Click 1 for YES and 2 for NO");
				int yesOrNo2 = myObj33.nextInt();
				
				if (yesOrNo2 == 1) {//if yes
					System.out.println("Product Menu: ");
					System.out.println("1: Mini Bouquet - $9.80");
					System.out.println("2: Regular Bouquet - $13.44");
					System.out.println("3: Jumbo Bouquet - $21.09");
					System.out.println("4: Flower Vase - 16.75");
					Scanner myOptionalObj = new Scanner(System.in);
					System.out.println("Pick a product");
					double product2 = myObj.nextDouble(); //set the product variable
					
					if (product2 == 1) {//if yes + product 1
						double price21 = 9.80;
						Scanner myOptionalObj2 = new Scanner(System.in);
						System.out.println("How many Mini Bouquets would you like?");
						double quantity21 = myOptionalObj2.nextDouble();
						price21 = (price21 * quantity21);
						System.out.println(quantity21 + product2 + "has been addded to cart");
						System.out.println("Your total is" + (price2 + price21));
						Scanner myOptionalObj3 = new Scanner(System.in);
						// if yes + product 
						System.out.println("Would you like to proceed with the transaction? Click 1 for YES and 2 for NO");
						int proceedOrNo = myOptionalObj3.nextInt();
						
						if (proceedOrNo == 1) {
							System.out.println("Thank you for shopping with Fancy Florals!");
							
						}else {
							System.out.println("I am sorry we could not provide you with any products today. Please check back when you are ready to purchase.");
						
					}}else if (product2 == 2) { //if yes + product2
						double price22 = 13.44;
						Scanner myOptionalObj2 = new Scanner(System.in);
						System.out.println("How many Regular Bouquets would you like?");
						double quantity22 = myOptionalObj2.nextDouble();
						price2 = (price22 * quantity22);
						System.out.println(quantity22 + product2 + "has been addded to cart");
						System.out.println("Your total is" + (price22 + price2));
						Scanner myOptionalObj3 = new Scanner(System.in);
						
						System.out.println("Would you like to proceed with the transaction? Click 1 for YES and 2 for NO");
						int proceedOrNo = myOptionalObj3.nextInt();
						
						if (proceedOrNo == 1) {
							System.out.println("Thank you for shopping with Fancy Florals!");
							
						}else {
							System.out.println("I am sorry we could not provide you with any products today. Please check back when you are ready to purchase.");}
					}else if (product2 == 3) {
						double price23 = 21.09;
						Scanner myOptionalObj2 = new Scanner(System.in);
						System.out.println("How many Jumbo Bouquets would you like?");
						double quantity23 = myOptionalObj2.nextDouble();
						price23 = (price23 * quantity23);
						System.out.println(quantity2 + product2 + "has been addded to cart");
						System.out.println("Your total is" + (price23 + price2));
						Scanner myOptionalObj3 = new Scanner(System.in);
						
						System.out.println("Would you like to proceed with the transaction? Click 1 for YES and 2 for NO");
						int proceedOrNo = myOptionalObj3.nextInt();
						
						if (proceedOrNo == 1) {
							System.out.println("Thank you for shopping with Fancy Florals!");
							
						}else {
							System.out.println("I am sorry we could not provide you with any products today. Please check back when you are ready to purchase.");}
						
					}else if (product2 == 4) {
						double price24 = 16.75;
						Scanner myOptionalObj2 = new Scanner(System.in);
						System.out.println("How many Vases would you like?");
						double quantity24 = myOptionalObj2.nextDouble();
						price2 = (price24 * quantity24);
						System.out.println(quantity24 + product2 + "has been addded to cart");
						System.out.println("Your total is" + (price2 + price24));
						Scanner myOptionalObj3 = new Scanner(System.in);
						
						System.out.println("Would you like to proceed with the transaction? Click 1 for YES and 2 for NO");
						int proceedOrNo = myOptionalObj3.nextInt();
						
						if (proceedOrNo == 1) {
							System.out.println("Thank you for shopping with Fancy Florals!");
							
						}else {
							System.out.println("I am sorry we could not provide you with any products today. Please check back when you are ready to purchase.");}
					
				
						}}else {
					System.out.println("Your total is" + (price2));
					Scanner myObj4 = new Scanner(System.in);
					
					System.out.println("Would you like to proceed with the transaction? Click 1 for YES and 2 for NO");
					int proceedOrNo = myObj4.nextInt();
					
					if (proceedOrNo == 1) {
						System.out.println("Thank you for shopping with Fancy Florals!");
						
					}else {
						System.out.println("I am sorry we could not provide you with any products today. Please check back when you are ready to purchase.");
				} if(product1==3) {
					double price3 = 21.09; //set price
					Scanner myObj222 = new Scanner(System.in);//create new obj
					System.out.println("How many Mini Bouquets would you like?");
					double quantity3 = myObj22.nextDouble();//dec quantity var
					price2 = (price3 * quantity3);//set price
					System.out.println(product1 + "has been addded to cart");
					
					//Second Product?
					Scanner myObj333 = new Scanner(System.in);
					System.out.println("Would you like to pick a second item? Click 1 for YES and 2 for NO");
					int yesOrNo22 = myObj333.nextInt();
					
					if (yesOrNo2 == 1) {//if yes
						System.out.println("Product Menu: ");
						System.out.println("1: Mini Bouquet - $9.80");
						System.out.println("2: Regular Bouquet - $13.44");
						System.out.println("3: Jumbo Bouquet - $21.09");
						System.out.println("4: Flower Vase - 16.75");
						Scanner myOptionalObj = new Scanner(System.in);
						System.out.println("Pick a product");
						double product2 = myObj.nextDouble(); //set the product variable
						
						if (product2 == 1) {//if yes + product 1
							double price31 = 9.80;
							Scanner myOptionalObj2 = new Scanner(System.in);
							System.out.println("How many Mini Bouquets would you like?");
							double quantity31 = myOptionalObj2.nextDouble();
							price31 = (price31 * quantity31);
							System.out.println(quantity31 + product2 + "has been addded to cart");
							System.out.println("Your total is" + (price3 + price31));
							Scanner myOptionalObj33 = new Scanner(System.in);
							// if yes + product 
							System.out.println("Would you like to proceed with the transaction? Click 1 for YES and 2 for NO");
							int proceedOrNoo = myOptionalObj33.nextInt();
							
							if (proceedOrNoo == 1) {
								System.out.println("Thank you for shopping with Fancy Florals!");
								
							}else {
								System.out.println("I am sorry we could not provide you with any products today. Please check back when you are ready to purchase.");
							
						}}else if (product2 == 2) {
							double price32 = 13.44;
							Scanner myOptionalObj2 = new Scanner(System.in);
							System.out.println("How many Regular Bouquets would you like?");
							double quantity32 = myOptionalObj2.nextDouble();
							price32 = (price32 * quantity32);
							System.out.println(quantity32 + product2 + "has been addded to cart");
							System.out.println("Your total is" + (price32 + price3));
							Scanner myOptionalObj33 = new Scanner(System.in);
							
							System.out.println("Would you like to proceed with the transaction? Click 1 for YES and 2 for NO");
							int proceedOrNoo = myOptionalObj33.nextInt();
							
							if (proceedOrNoo == 1) {
								System.out.println("Thank you for shopping with Fancy Florals!");
								
							}else {
								System.out.println("I am sorry we could not provide you with any products today. Please check back when you are ready to purchase.");}
						}else if (product2 == 3) {
							double price33 = 21.09;
							Scanner myOptionalObj2 = new Scanner(System.in);
							System.out.println("How many Jumbo Bouquets would you like?");
							double quantity33 = myOptionalObj2.nextDouble();
							price33 = (price33 * quantity33);
							System.out.println(product2 + "has been addded to cart");
							System.out.println("Your total is" + (price3 + price33));
							Scanner myOptionalObj333 = new Scanner(System.in);
							
							System.out.println("Would you like to proceed with the transaction? Click 1 for YES and 2 for NO");
							int proceedOrNoo = myOptionalObj333.nextInt();
							
							if (proceedOrNoo == 1) {
								System.out.println("Thank you for shopping with Fancy Florals!");
								
							}else {
								System.out.println("I am sorry we could not provide you with any products today. Please check back when you are ready to purchase.");}
							
						}else if (product2 == 4) {
							double price24 = 16.75;
							Scanner myOptionalObj2 = new Scanner(System.in);
							System.out.println("How many Vases would you like?");
							double quantity24 = myOptionalObj2.nextDouble();
							price2 = (price24 * quantity24);
							System.out.println(product2 + "has been addded to cart");
							System.out.println("Your total is" + (price2 + price24));
							Scanner myOptionalObj333 = new Scanner(System.in);
							
							System.out.println("Would you like to proceed with the transaction? Click 1 for YES and 2 for NO");
							int proceedOrNoo = myOptionalObj333.nextInt();
							
							if (proceedOrNoo == 1) {
								System.out.println("Thank you for shopping with Fancy Florals!");
								
							}else {
								System.out.println("I am sorry we could not provide you with any products today. Please check back when you are ready to purchase.");}
						
					
							}}else {
						System.out.println("Your total is" + (price3));
						Scanner myObj44 = new Scanner(System.in);
						
						System.out.println("Would you like to proceed with the transaction? Click 1 for YES and 2 for NO");
						int proceedOrNoo = myObj44.nextInt();
						
						if (proceedOrNoo == 1) {
							System.out.println("Thank you for shopping with Fancy Florals!");
							
						}else {
							System.out.println("I am sorry we could not provide you with any products today. Please check back when you are ready to purchase.");
					}if (product1 == 4) {
						double price4 = 16.75; //set price
						Scanner myObj444 = new Scanner(System.in);//create new obj
						System.out.println("How many Mini Bouquets would you like?");
						double quantity4 = myObj444.nextDouble();//dec quantity var
						price4 = (price4 * quantity4);//set price
						System.out.println(quantity4 + product1 + "has been addded to cart");
						
						//Second Product?
						Scanner myObj44444 = new Scanner(System.in);
						System.out.println("Would you like to pick a second item? Click 1 for YES and 2 for NO");
						int yesOrNo44 = myObj444.nextInt();
						
						if (yesOrNo2 == 1) {//if yes
							System.out.println("Product Menu: ");
							System.out.println("1: Mini Bouquet - $9.80");
							System.out.println("2: Regular Bouquet - $13.44");
							System.out.println("3: Jumbo Bouquet - $21.09");
							System.out.println("4: Flower Vase - 16.75");
							Scanner myOptionalObj = new Scanner(System.in);
							System.out.println("Pick a product");
							double product2 = myObj.nextDouble(); //set the product variable
							
							if (product2 == 1) {//if yes + product 1
								double price41 = 9.80;
								Scanner myOptionalObj2 = new Scanner(System.in);
								System.out.println("How many Mini Bouquets would you like?");
								double quantity41 = myOptionalObj2.nextDouble();
								price41 = (price41 * quantity41);
								System.out.println(quantity41 + product2 + "has been addded to cart");
								System.out.println("Your total is" + (price4 + price41));
								Scanner myOptionalObj33 = new Scanner(System.in);
								// if yes + product 
								System.out.println("Would you like to proceed with the transaction? Click 1 for YES and 2 for NO");
								int proceedOrNooo = myOptionalObj33.nextInt();
								
								if (proceedOrNooo == 1) {
									System.out.println("Thank you for shopping with Fancy Florals!");
									
								}else {
									System.out.println("I am sorry we could not provide you with any products today. Please check back when you are ready to purchase.");
								
							}}else if (product2 == 2) {
								double price42 = 13.44;
								Scanner myOptionalObj97 = new Scanner(System.in);
								System.out.println("How many Regular Bouquets would you like?");
								double quantity42 = myOptionalObj97.nextDouble();
								price42 = (price42 * quantity42);
								System.out.println(product2 + "has been addded to cart");
								System.out.println("Your total is" + (price42 + price4));
								Scanner myOptionalObj4444 = new Scanner(System.in);
								
								System.out.println("Would you like to proceed with the transaction? Click 1 for YES and 2 for NO");
								int proceedOrNooo = myOptionalObj4444.nextInt();
								
								if (proceedOrNooo == 1) {
									System.out.println("Thank you for shopping with Fancy Florals!");
									
								}else {
									System.out.println("I am sorry we could not provide you with any products today. Please check back when you are ready to purchase.");}
							}else if (product2 == 3) {
								double price43 = 21.09;
								Scanner myOptionalObj2324 = new Scanner(System.in);
								System.out.println("How many Jumbo Bouquets would you like?");
								double quantity43 = myOptionalObj2324.nextDouble();
								price43 = (price43 * quantity43);
								System.out.println(quantity43 + product2 + "has been addded to cart");
								System.out.println("Your total is" + (price4 + price43));
								Scanner myOptionalObj333 = new Scanner(System.in);
								
								System.out.println("Would you like to proceed with the transaction? Click 1 for YES and 2 for NO");
								int proceedOrNooo = myOptionalObj333.nextInt();
								
								if (proceedOrNooo == 1) {
									System.out.println("Thank you for shopping with Fancy Florals!");
									
								}else {
									System.out.println("I am sorry we could not provide you with any products today. Please check back when you are ready to purchase.");}
								
							}else if (product2 == 4) {
								double price44 = 16.75;
								Scanner myOptionalObj452 = new Scanner(System.in);
								System.out.println("How many Vases would you like?");
								double quantity44 = myOptionalObj452.nextDouble();
								price4 = (price44 * quantity44);
								System.out.println(quantity44 + product2 + "has been addded to cart");
								System.out.println("Your total is" + (price4 + price44));
								Scanner myOptionalObj333 = new Scanner(System.in);
								
								System.out.println("Would you like to proceed with the transaction? Click 1 for YES and 2 for NO");
								int proceedOrNooo = myOptionalObj333.nextInt();
								
								if (proceedOrNooo == 1) {
									System.out.println("Thank you for shopping with Fancy Florals!");
									
								}else {
									System.out.println("I am sorry we could not provide you with any products today. Please check back when you are ready to purchase.");}
							
						
								}}else {
							System.out.println("Your total is" + (price3));
							Scanner myObj443 = new Scanner(System.in);
							
							System.out.println("Would you like to proceed with the transaction? Click 1 for YES and 2 for NO");
							int proceedOrNooo = myObj443.nextInt();
							
							if (proceedOrNoo == 1) {
								System.out.println("Thank you for shopping with Fancy Florals!");
								
							}else {
								System.out.println("I am sorry we could not provide you with any products today. Please check back when you are ready to purchase.");
						}
						}}
					}
		}}}}}}
			
			
			
			
		
		


		

	
		

		

	


