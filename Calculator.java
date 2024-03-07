/* This code defines a Calculator class with methods for 
*  addition, subtraction, multiplication, division, and modulo operations. 
*/

public class Calculator {
    // Constructor for the Calculator class
    public Calculator() {

    }

    // Method for adding two double values
    public double add(double a, double b) {
        // Returns the sum of the input values 'a' and 'b'
        return a + b;
    }

    // Method for subtracting two double values
    public double subtract(double a, double b) {
        // Returns the difference between the input values 'a' and 'b'
        return a - b;
    }

    // Method for multiplying two double values
    public double multiply(double a, double b) {
        // Returns the product of the input values 'a' and 'b'
        return a * b;
    }

    // Method for dividing two double values
    public double divide(double a, double b) {
        // Returns the quotient obtained by dividing the input value 'a' by 'b'
        return a / b;
    }

    // This is the modulo method
    public double modulo(double a, double b) {
        return a % b;
    }

    // This is the main method
    public static void main(String[] args) {
        // This is the myCalculator object
        Calculator myCalculator = new Calculator();
        
        System.out.println(myCalculator.add(5, 7));
        System.out.println(myCalculator.subtract(45, 11));
    }
}