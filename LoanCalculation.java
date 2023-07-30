//Talla Mohmmed-Ahmmed
//Assignment 3a
//08/11/22

import java.util.Scanner;//import Scanner Class for User Input

public class LoanCalculation {
	public static void main(String[] args) {
		//Monthly Interest Rate
		Scanner myObj = new Scanner(System.in);//create scaner object
		System.out.println("Enter the Yearly Interest Rate: "); //ask user
		float yearlyInterestRate = myObj.nextFloat();//convert input to float var
		System.out.println("yearly interest rate" + yearlyInterestRate);
		float r;//declare monthly variable
		r = yearlyInterestRate / 12; //set monthly variable
		System.out.println("monthly interest rate" + r);
		
		//Loan Amount
		Scanner mySecondObj = new Scanner(System.in); //repeat of monthly 
		System.out.println("Enter the Loan Amount: ");
		float loanAmount = mySecondObj.nextFloat();
		System.out.println("loan amount" + loanAmount);
		
		//Number of Loan Years
		Scanner myThirdObj = new Scanner(System.in);
		System.out.println("Enter the Number of Loan Years: ");
		float loanYears = myThirdObj.nextFloat();
		System.out.println("loan years" + loanYears);
		float numberPeriods; //declare var loan months
		numberPeriods= loanYears * 12; //assign value to it
		System.out.println("loan months" + numberPeriods);
		
		//Discount
		float x; //declare var x
		x = (r + 1); //assign it to be rate + 1
		System.out.println("x" + x);
		double firstPartOfDiscountEquation = Math.pow(x, numberPeriods); //calc the exponent
		System.out.println("first part" + firstPartOfDiscountEquation);
		--firstPartOfDiscountEquation; //set it to itself minus 1
		System.out.println("first part minus 1" + firstPartOfDiscountEquation);
		
		float x2;
		x2 = (x * r);//assign it to be (rate + 1) * rate
		System.out.println("x2" + x2);
		double secondPartOfDiscountEquation = Math.pow(x2, numberPeriods);//calc the exponent
		System.out.println("second part" + secondPartOfDiscountEquation);
		
		double discount;
		discount = (firstPartOfDiscountEquation / secondPartOfDiscountEquation);//discount equation
		System.out.println("discount" + discount);
		
		//Calculate Monthly Payment
		double monthlyPayment;
		monthlyPayment = (loanAmount / discount); //calc monthly payment
		System.out.println("monthly payment" + monthlyPayment);
		
		//Calculate the Total Payment 
		double totalPayment; 
		totalPayment = (monthlyPayment * numberPeriods); //multiply monthly payment by number of months paying
		
		System.out.println("Your total payment will be " + totalPayment);//tell user the final price
		
	}

}
