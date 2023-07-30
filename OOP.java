//Talla Mohmmed-Ahmmed
//Assignment 10
//11/10/22
import java.util.Scanner;

class Employee {

  String firstName;
  String lastName;
  String fullName;
  int lasAnnRev;


  public Employee(String string, String string2, String string3, int int1) {
}

public void setFirstName(String newFName) {
    this.firstName = firstName;
  }

  public String getFirstName(){
    return firstName;
  }

  public void setLastName(String newLName) {
    this.lastName = lastName;
  }

  public String getLastName(){
    return lastName;
  }

  public void setFullName(String newFName) {
    this.fullName = fullName;
  }

  public String getFullName(){
    return fullName;
  }


  public void setlasAnnRev(int newlasAnnRev) {
    this.lasAnnRev = lasAnnRev;
  }

  public Object getlasAnnRev(){
    return lasAnnRev;
  }


  }


class Date{
  int month;
  int day;
  int year;
  
  public Date (int year, int month, int day) {
	  this.month = month;
	  this.day   = day;
	  this.year  = year;}
  	  public int addVacaDay() {
  		  int vacadayyear = (year);
  		  int vacadaymonth = (month);
  		  int vacadayday = (day);
  		  return (vacadayyear + vacadaymonth + vacadayday);  		  }
  	  public String cancelvacayday() {
  		  String cancelvacayday = "vaca day is cancelled";
  		  return cancelvacayday;
  	  }
  	  }

	 

public class OOP{ 
	public static void main(String[] args){  
		// create new employees objects with the parameterized constructor
		Scanner input = new Scanner(System.in);
		System.out.println("Enter Employee 1 last name");
		String lastName = input.nextLine();
		System.out.println("Enter Employee 1 first name");
		String firstName = input.nextLine();
		System.out.println("Enter Employee 1 full name");
		String fullName = input.nextLine();
		System.out.println("If Employee 1 reaches proficient levels in work Enter 1, if not enter 2");
		int annualAssesment = input.nextInt();
		Employee employee1 = new Employee(firstName, lastName, fullName, annualAssesment);
		System.out.println("Enter Employee 2 last name");
		String lastName2 = input.nextLine();
		System.out.println("Enter Employee 2 first name");
		String firstName2 = input.nextLine();
		System.out.println("Enter Employee 2 full name");
		String fullName2 = input.nextLine();
		System.out.println("If Employee 2 reaches proficient levels in work Enter 1, if not enter 2");
		int annualAssesment2 = input.nextInt();
		Employee employee2 = new Employee(firstName2, lastName2, fullName2, annualAssesment2);
		System.out.println("Enter Employee 3 last name");
		String lastName3 = input.nextLine();
		System.out.println("Enter Employee 3 first name");
		String firstName3 = input.nextLine();
		System.out.println("Enter Employee 3 full name");
		String fullName3 = input.nextLine();
		System.out.println("If Employee 3 reaches proficient levels in work Enter 1, if not enter 2");
		int annualAssesment3 = input.nextInt();
		Employee employee3 = new Employee(firstName3, lastName3, fullName3, annualAssesment3);
		//schedule vacations
		System.out.println("Enter employee 1 first vacation year");
		int vacayear1 = input.nextInt();
		System.out.println("Enter employee 1 first vacation month");
		int vacamonth1 = input.nextInt();
		System.out.println("Enter employee 1 first vacation day");
		int vacaday1 = input.nextInt();
		Date employee1Vaca = new Date(vacayear1, vacamonth1, vacaday1);
		System.out.println("Enter employee 1 second vacation year");
		int vacayear2 = input.nextInt();
		System.out.println("Enter employee 1 second vacation month");
		int vacamonth2 = input.nextInt();
		System.out.println("Enter employee 1 second vacation day");
		int vacaday2 = input.nextInt();
		Date employee1Vaca2 = new Date(vacayear2, vacamonth2, vacaday2);
		System.out.println("Enter employee 2 first vacation year");
		int vacayear3 = input.nextInt();
		System.out.println("Enter employee 2 first vacation month");
		int vacamonth3 = input.nextInt();
		System.out.println("Enter employee 2 first vacation day");
		int vacaday3 = input.nextInt();
		Date employee2Vaca = new Date(vacayear3, vacamonth3, vacaday3);
		System.out.println("Enter employee 2 second vacation year");
		int vacayear4 = input.nextInt();
		System.out.println("Enter employee 2 second vacation month");
		int vacamonth4 = input.nextInt();
		System.out.println("Enter employee 2 second vacation day");
		int vacaday4 = input.nextInt();
		Date employee2Vaca2 = new Date(vacayear4, vacamonth4, vacaday4);
		System.out.println("Enter employee 3 first vacation year");
		int vacayear5 = input.nextInt();
		System.out.println("Enter employee 3 first vacation month");
		int vacamonth5 = input.nextInt();
		System.out.println("Enter employee 3 first vacation day");
		int vacaday5 = input.nextInt();
		Date employee3Vaca = new Date(vacayear5, vacamonth5, vacaday5);
		System.out.println("Enter employee 3 second vacation year");
		int vacayear6 = input.nextInt();
		System.out.println("Enter employee 3 second vacation month");
		int vacamonth6 = input.nextInt();
		System.out.println("Enter employee 3 second vacation day");
		int vacaday6 = input.nextInt();
		Date employee3Vaca2 = new Date(vacayear1, vacamonth1, vacaday1);
		employee3Vaca2.cancelvacayday();
		employee2Vaca.cancelvacayday();
		employee1Vaca.cancelvacayday();
		System.out.println("Pick an employee to terminate: 1 2 or 3");
		int whichemployee = input.nextInt();
		if (whichemployee==1) {
		System.out.println("Fancy Florals Employees:");
		System.out.println(employee2);
		System.out.println(employee3);}
		else if (whichemployee==2) {
			System.out.println("Fancy Florals Employees:");
			System.out.println(employee1);
			System.out.println(employee3);}
		if (whichemployee==3) {
			System.out.println("Fancy Florals Employees:");
			System.out.println(employee1);
			System.out.println(employee2);}

		}
		

    }