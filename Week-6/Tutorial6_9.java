import arithmetic.add.Add;
import arithmetic.divide.Divide;
import arithmetic.multiply.Multiply;
import arithmetic.subtract.Subtract;


public class Tutorial6_9 {
  public static void main(String[] args) {

    // Get the input numbers
    int a = 10;
    int b = 5;

    // Perform the arithmetic operations
    int sum = Add.add(a, b);
    int difference = Subtract.subtract(a, b);
    int product = Multiply.multiply(a, b);
    int quotient = Divide.divide(a, b);

    // Print the results
    System.out.println("Sum: " + sum);
    System.out.println("Difference: " + difference);
    System.out.println("Product: " + product);
    System.out.println("Quotient: " + quotient);
  }
}