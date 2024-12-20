public class ArrayIndexOutOfBoundsExceptionExample {
    public static void main(String[] args) {
        try {
            // Create an array with 3 elements
            int[] array = {1, 2, 3};

            // Attempt to access an invalid index
            // This will trigger an ArrayIndexOutOfBoundsException
            int invalidElement = array[5];

        } catch (ArrayIndexOutOfBoundsException e) {
            // Handle the exception for accessing invalid array indices
            System.out.println("Array index error: Index out of bounds.");
        }
    }
}

