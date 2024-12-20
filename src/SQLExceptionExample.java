import java.sql.*;

public class SQLExceptionExample {
    public static void main(String[] args) {
        try {
            // Attempt to connect to a non-existent database
            // This simulates a SQL exception when the database connection fails
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/invalidDB", "user", "pass");

        } catch (SQLException e) {
            // Handle SQL exception errors
            System.out.println("Database error: " + e.getMessage());
        }
    }
}

