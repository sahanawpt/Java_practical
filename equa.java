package Activity_W5;
import java.util.Scanner;
public class equa {
    public static double power(double x, int n) {
        double result = 1.0;
        for (int i = 0; i < n; i++) {
            result *= x;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the base (X): ");
        double base = scanner.nextDouble();
        
        System.out.print("Enter the exponent (n): ");
        int exponent = scanner.nextInt();
        
        double result = power(base, exponent);
        System.out.println("Result: " + result);
        
        scanner.close();
    }
}