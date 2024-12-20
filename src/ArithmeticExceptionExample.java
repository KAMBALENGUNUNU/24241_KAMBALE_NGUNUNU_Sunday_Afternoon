public class ArithmeticExceptionExample {
    public static void main(String[] args) {
        try {
            // Simulate a division by zero
            // This will trigger an ArithmeticException
            int result = 10 / 0;

        } catch (ArithmeticException e) {
            // Handle the exception for invalid arithmetic operations
            System.out.println("Arithmetic error: Division by zero is not allowed.");
        }
    }
}
