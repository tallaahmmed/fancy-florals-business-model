//Talla Mohmmed-Ahmmed
//Assignment 3b
//08/11/22

import java.util.Scanner; //import Scanner class

public class InvestorCalculation {
	public static void main(String[] args) {
		
		//User Input
		
		//Amount Invested (same setup for each var)
		Scanner myObj = new Scanner(System.in); //create new scanner
		System.out.println("Enter the Amount Invested: ");
		float amountInvested = myObj.nextFloat(); //convert user inout to float var
		
		//Current Company Valuation
		Scanner mySecondObj = new Scanner(System.in); 
		System.out.println("Enter the Current Company Valuation in Millions: ");
		float presentValue = mySecondObj.nextFloat();
		
		//Estimated Rate of Growth
		Scanner myThirdObj = new Scanner(System.in);
		System.out.println("Enter the Estimated rate of growth as a percentage: ");
		float growthRate = myThirdObj.nextFloat();
		
		//Percentage of company given for investment
		Scanner myFourthObj = new Scanner(System.in);
		System.out.println("Enter the Percentage of company given for investment: ");
		float investorPercentage =myFourthObj.nextFloat();
		
		//Number of investment years
		Scanner myFifthObj = new Scanner(System.in);
		System.out.println("Enter the Number of investment years: ");
		float time = myFifthObj.nextFloat();
		
		//Calculations
		
		//Calculate the total future value of company
		float growthRatePlusOne; //declare var
		growthRatePlusOne = (growthRate + 1); //create variable needed for equation w/o changing og var
		float presentValueTimesGrowthRatePlusOne; //dec var
		presentValueTimesGrowthRatePlusOne = (growthRatePlusOne * presentValue); // create var needed w/o changing og var
		double companyFutureValue = Math.pow(presentValueTimesGrowthRatePlusOne, time);//use math.pow func for exponents
		
		//Future value of investor’s percentage
		double futureValueOfInvestorPercentage;//declare var
		futureValueOfInvestorPercentage = (investorPercentage * companyFutureValue);//equation
		
		//Owner Future Value
		double ownerFutureValue;//declare var
		ownerFutureValue = (companyFutureValue - (amountInvested + futureValueOfInvestorPercentage));//equation
		
		
		//Outputs
		
		System.out.println("Here is a recap:");
		System.out.println("Amount Invested: " + amountInvested);
		System.out.println("Current Company Valuation in Millions: " + presentValue);
		System.out.println("Estimated Rate of Growth: " + growthRate);
		System.out.println("Percentage of company given for investment: " + investorPercentage);
		System.out.println("Number of Investment Years: " + time);
		System.out.println("Total Future Value of Company: " + companyFutureValue);
		System.out.println("Future Value of Investor's Percentage: " + amountInvested);
		System.out.println("Owner Future Value: " + ownerFutureValue);









		
		
	}

}
