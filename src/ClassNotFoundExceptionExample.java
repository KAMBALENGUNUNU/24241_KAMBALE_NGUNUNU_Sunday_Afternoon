public class ClassNotFoundExceptionExample {
    public static void main(String[] args) {
        try {
            // Attempt to load a class that does not exist
            // This simulates a ClassNotFoundException
            Class.forName("NonExistentClass");

        } catch (ClassNotFoundException e) {
            // Handle the exception if the class is not found
            System.out.println("Class not found: " + e.getMessage());
        }
    }
}
