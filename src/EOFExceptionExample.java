import java.io.*;

public class EOFExceptionExample {
    public static void main(String[] args) {
        try {
            // Create a ByteArrayInputStream to simulate file reading
            ByteArrayInputStream input = new ByteArrayInputStream(new byte[5]);

            // Wrap it in a DataInputStream to read bytes
            DataInputStream dataInput = new DataInputStream(input);

            // Attempt to read beyond the end of the data
            // This will trigger an EOFException
            for (int i = 0; i < 10; i++) {
                dataInput.readByte();
            }

        } catch (EOFException e) {
            // Handle the case when we unexpectedly reach the end of a file
            System.out.println("Reached the end of the file unexpectedly.");
        } catch (IOException e) {
            // Catch any other I/O errors
            System.out.println("An I/O error occurred: " + e.getMessage());
        }
    }
}

