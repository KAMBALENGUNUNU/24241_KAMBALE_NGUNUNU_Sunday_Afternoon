public class IllegalArgumentExceptionExample {
    public static void main(String[] args) {
        try {
            // Pass a negative value to a method that does not allow it
            // This will trigger an IllegalArgumentException
            Thread.sleep(-100);

        } catch (IllegalArgumentException e) {
            // Handle the exception for invalid arguments
            System.out.println("Illegal argument error: Negative sleep time is not allowed.");
        } catch (InterruptedException e) {
            // Handle the InterruptedException in case the thread is interrupted
            System.out.println("Thread was interrupted.");
        }
    }
}

