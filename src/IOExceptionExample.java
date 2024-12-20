import java.io.*;

public class IOExceptionExample {
    public static void main(String[] args) {
        try {
            // Attempt to read a file that does not exist
            // This simulates an IOException due to an input/output issue
            BufferedReader reader = new BufferedReader(new FileReader("nonexistent.txt"));

            // Try reading the first line from the file
            String line = reader.readLine();

        } catch (IOException e) {
            // This block will handle the IOException
            // It gets triggered because the file does not exist
            System.out.println("An I/O error occurred: " + e.getMessage());
        }
    }
}

