package Activity;

public class Activity_Employee {
	    private String name;
	    private double salary;
	    private String designation;
	    public Activity_Employee(String name, double salary, String designation) {
	        this.name = name;
	        this.salary = salary;
	        this.designation = designation;
	    }
	    public void displayDetails() {
	        System.out.println("Employee Name: " + name);
	        System.out.println("Employee Salary: " + salary);
	        System.out.println("Employee Designation: " + designation);
	    }
	    public static void main(String[] args) {
	    	Activity_Employee employee = new Activity_Employee("Bob", 75000, "Manager");
	        employee.displayDetails();
	    }
	}
