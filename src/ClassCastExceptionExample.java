public class ClassCastExceptionExample {
    public static void main(String[] args) {
        try {
            // Create an object of type Integer
            Object obj = new Integer(10);

            // Attempt to cast it to a String
            // This will trigger a ClassCastException
            String str = (String) obj;

        } catch (ClassCastException e) {
            // Handle the exception for invalid type conversions
            System.out.println("Class cast error: Invalid type conversion.");
        }
    }
}

