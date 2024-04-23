package Activity_W5;
import java.util.Scanner;
public class Cal_Salary {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Prompt user to input the number of employees
	        System.out.print("Enter the number of employees: ");
	        int numEmployees = scanner.nextInt();

	        // Validate input for non-negative values
	        if (numEmployees < 0) {
	            System.out.println("Number of employees cannot be negative. Please try again.");
	            return;
	        }

	        double totalSalary = 0;

	        // Iterate over each employee to get hourly wage and hours worked
	        for (int i = 1; i <= numEmployees; i++) {
	            System.out.println("\nEnter details for employee " + i + ":");
	            System.out.print("Hourly wage: ");
	            double hourlyWage = scanner.nextDouble();
	            System.out.print("Hours worked: ");
	            double hoursWorked = scanner.nextDouble();

	            // Validate input for non-negative values
	            if (hourlyWage < 0 || hoursWorked < 0) {
	                System.out.println("Hourly wage and hours worked cannot be negative. Please try again.");
	                return;
	            }

	            // Calculate salary for current employee and add it to total salary
	            double salary = hourlyWage * hoursWorked;
	            totalSalary += salary;
	        }

	        // Display the total salary for all employees
	        System.out.println("\nTotal salary for all employees: $" + totalSalary);

	        // Close the scanner
	        scanner.close();
	    }
	}