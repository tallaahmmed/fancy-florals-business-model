/* Talla Mohmmed-Ahmmed
 * Assignment 8
 * 10/30/22
 */
import java.util.Scanner; //import scanner class

public class EmployeeData {

	public static void main(String[] args) {
		System.out.println("Welcome to the Fancy Florals Employee Data Menu!"); //welcome message
		Scanner input = new Scanner(System.in);//declare new scanner
		System.out.println("Enter the number of employees: ");
		int employeeAmount = input.nextInt(); //declare var + add user input to it
		int[][] employees = new int[employeeAmount][2];//declare array
		
		//add employee ids to array
		for(int i = 0; i < employeeAmount; i++) {
			System.out.println("Enter 6-Digit Employee ID: ");
			int employeeID = input.nextInt();
			System.out.println("Is this employee salaried or payed hourly? Enter 1 for hourly and 2 for salaried: ");
			int employeePayment = input.nextInt();
		    employees[i][0] = employeeID;
		    employees[i][1] = employeePayment;
		}
		//display employees
		for (int k = 0; k < employeeAmount; k++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(employees[k][j] + " ");
            }
 
            System.out.println();
        }}

}
