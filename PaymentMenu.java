/*Assignment 7
 * Talla Mohmmed-Ahmmed
 * 10/11/22
 */
import java.util.Scanner;//import scanner class
public class PaymentMenu {

	public static void main(String[] args) {
		int x = 0;
		int y = 0;
		String z = " ";
		//payment type
		Scanner input = new Scanner(System.in);
		System.out.println("Please pick payment type: 1 - Cash/Check  2 - Purchase Requisition  3 - Card ");
		int paymentType = input.nextInt();
		if ((paymentType==1) || (paymentType==2)) {
			System.out.println("Thank you for shopping with Fancy Florals");}
		else {
			System.out.println("Enter the first digit of your Credit Card Number to check for type: ");
			x = input.nextInt();
			System.out.println("Enter the amount of digits in your card number to check for validity");
			y = input.nextInt();}
		isCardValid(x, y);
		findCardType(x);

	}
	public static void isCardValid(int x, int y) {
		if (((x<3) || (x>6)) || ((y<15) || (y>16))) {
			Scanner input2 = new Scanner(System.in);
			System.out.println("Card is invalid, Try Again - Enter the first digit of your credit card: ");
			x= input2.nextInt();
			System.out.println("Enter the amount of digits in your card number: ");
			y= input2.nextInt();}
		else{
			System.out.println("Card is valid!");}
		}
	
	public static void findCardType(int x) {
		if(x==3){
			System.out.println("Your American Express Card Transaction was succesful! Thank you for shopping with Fancy Florals!");}
		else if(x==4){
			System.out.println("Your Visa Card Transaction was succesful! Thank you for shopping with Fancy Florals!");}
		else if(x==5) {
			System.out.println("Your MasterCard Card Transaction was succesful! Thank you for shopping with Fancy Florals!");}
		else if(x==6) {
			System.out.println("Your Discovery Card Transaction was succesful! Thank you for shopping with Fancy Florals!");}

			
		
		
}
}
