package Activity;

public class Actvity_Circle {	    
	    private double radius;
	    public Actvity_Circle() {
	        this.radius = 7.0;
	    }
	    public Actvity_Circle(double radius) {
	        this.radius = radius;
	    }
	    public double calculateArea() {
	        return Math.PI * radius * radius;
	    }
	    public double calculateCircumference() {
	        return 2 * Math.PI * radius;
	    }

	    public static void main(String[] args) {
	        Actvity_Circle circle = new Actvity_Circle();
	        System.out.println("Initial radius: " + circle.radius);
	        circle.radius = 15.0; // 
	        System.out.println("Modified radius: " + circle.radius);
	        System.out.println("Area: " + circle.calculateArea());
	        System.out.println("Circumference: " + circle.calculateCircumference());
	    }
}

