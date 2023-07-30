//Assignment 6
//Talla Mohmmed-Ahmmed

import java.util.Scanner; //import scanner class 

public class DeliveryMenu {
	public static void main(String[] args) {
		//dec var
		int obj = 1;
		int day2;
		int month2;
        int year;
        int day;
        int month;
		
		//print item menu
		while (obj == 1) {
			System.out.println("Product Menu: ");
			System.out.println("1: Mini Bouquet - $9.80");
			System.out.println("2: Regular Bouquet - $13.44");
			System.out.println("3: Jumbo Bouquet - $21.09");
			System.out.println("4: Flower Vase - 16.75");
		
		//user input
			Scanner myProduct = new Scanner(System.in); //declare scanner
			System.out.println("Pick a product");
			double product = myProduct.nextDouble(); //set the product variable 
		
		//month
			Scanner myMonth = new Scanner(System.in);
			System.out.println("Please enter the delivery month: ");
			month = myMonth.nextInt();
			if (month==1) {
				String monthName = "January";}
			else if (month==2) {
				String monthName = "Febuary";}
			else if (month==3) {
				String monthName = "March";}
			else if (month==4) {
				String monthName = "April";}
			else if (month==5) {
				String monthName = "May";}
			else if (month==6) {
				String monthName = "June";}
			else if (month==7) {
				String monthName = "July";}
			else if (month==8) {
				String monthName = "August";}
			else if (month==9) {
				String monthName = "September";}
			else if (month==10) {
				String monthName = "October";}
			else if (month==11) {
				String monthName = "November";}
			else if (month==12) {
				String monthName = "December";}
		
			if (month>12) {
				System.out.println("Month is invalid. Try Again");
				Scanner myNewMonth = new Scanner(System.in);
				System.out.println("Please enter the delivery month: ");
				month = myNewMonth.nextInt();
				if (month==1) {
					String monthName = "January";}
				else if (month==2) {
					String monthName = "Febuary";}
				else if (month==3) {
					String monthName = "March";}
				else if (month==4) {
					String monthName = "April";}
				else if (month==5) {
					String monthName = "May";}
				else if (month==6) {
					String monthName = "June";}
				else if (month==7) {
					String monthName = "July";}
				else if (month==8) {
					String monthName = "August";}
				else if (month==9) {
					String monthName = "September";}
				else if (month==10) {
					String monthName = "October";}
				else if (month==11) {
					String monthName = "November";}
				else if (month==12) {
					String monthName = "December";}
			}
		
		//day
			Scanner myDay = new Scanner(System.in);
			System.out.println("Enter Delivery Day: ");
			day = myDay.nextInt();
		
			if (day > 31) {
				System.out.println("Day is invalid. Try Again");
				Scanner myNewDay = new Scanner(System.in);
				System.out.println("Enter Delivery Day: ");
				day = myNewDay.nextInt();}
		
		//year
			Scanner myYear = new Scanner(System.in);
			System.out.println("Enter Delivery Year: ");
			year = myYear.nextInt();
		
			if (year<2022) {
				System.out.println("Year is invalid Try Again");
				Scanner myNewYear = new Scanner(System.in);
				System.out.println("Enter Delivery Year: ");
				year = myNewYear.nextInt();}
		

		//blocked out dates / end menu
			if (month==1 && day==1) {
				System.out.println("Sorry, date is not available");}
			else if (month==3 && day==20) {
				System.out.println("Sorry, date is not available");}
			else if (month==4 && day==22) {
				System.out.println("Sorry, date is not available");}
			else if (month==5 && day==1) {
				System.out.println("Sorry, date is not available");}
			else if (month==6 && day==5) {
				System.out.println("Sorry, date is not available");}
			else if (month==8 && day==2) {
				System.out.println("Sorry, date is not available");}
			else if (month==12 && day==31) {
				System.out.println("Sorry, date is not available");}
			else {
				System.out.println("Congrats your package will be delivered on " + month + " " + day + " " + year);
				Scanner yesOrNo = new Scanner(System.in);
				System.out.println("Select 1 if you wish to confirm or 2 if you want to enter another date");
				int yesorno = yesOrNo.nextInt();
				if (yesorno==1) {
					System.out.println("Thanks for shopping with Fancy Florals!");}
			}
		
		
		
		

	}

	}}
