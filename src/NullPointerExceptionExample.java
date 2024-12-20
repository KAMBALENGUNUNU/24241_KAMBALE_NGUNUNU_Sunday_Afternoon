public class NullPointerExceptionExample {
    public static void main(String[] args) {
        try {
            // Create a null object
            String str = null;

            // Attempt to access a method on a null object
            // This will trigger a NullPointerException
            str.length();

        } catch (NullPointerException e) {
            // Handle the exception for accessing a null reference
            System.out.println("Null pointer error: Attempted to access an object that is null.");
        }
    }
}
