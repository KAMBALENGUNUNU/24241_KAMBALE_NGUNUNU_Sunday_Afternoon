public class NumberFormatExceptionExample {
    public static void main(String[] args) {
        try {
            // Attempt to parse an invalid number string
            // This will trigger a NumberFormatException
            int number = Integer.parseInt("invalidNumber");

        } catch (NumberFormatException e) {
            // Handle the exception for invalid number formats
            System.out.println("Number format error: Invalid number format.");
        }
    }
}

