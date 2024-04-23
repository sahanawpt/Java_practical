package Activity_W5;

public class Product {
	    public static int multiplyWithoutOperator(int a, int b) {
	        int product = 0;
	        for (int i = 0; i < Math.abs(b); i++) {
	            product += a;
	        }
	        if ((a < 0 && b > 0) || (a > 0 && b < 0)) {
	            return -product;
	        } else {
	            return product;
	        }
	    }

	    public static void main(String[] args) {
	        int result = multiplyWithoutOperator(7 ,3);
	        System.out.println("Product of two numbers is:" + result); 
	    }
	} 
