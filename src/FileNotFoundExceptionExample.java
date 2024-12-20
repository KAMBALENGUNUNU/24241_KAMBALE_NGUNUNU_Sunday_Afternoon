import java.io.*;

public class FileNotFoundExceptionExample {
    public static void main(String[] args) {
        try {
            // Attempt to open a non-existent file
            // This simulates a FileNotFoundException
            FileInputStream file = new FileInputStream("nonexistent.txt");

        } catch (FileNotFoundException e) {
            // This block will handle the FileNotFoundException
            // It prints an error message when the file cannot be found
            System.out.println("File not found! Please check the file path.");
        }
    }
}

