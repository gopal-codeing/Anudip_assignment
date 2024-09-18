import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateEmployeeTable {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/your_database_name"; // Replace with your database URL
        String user = "your_username"; // Replace with your MySQL username
        String password = "your_password"; // Replace with your MySQL password

        Connection conn = null;
        Statement stmt = null;

        try {
            // Establish the connection
            conn = DriverManager.getConnection(url, user, password);
            stmt = conn.createStatement();

            // SQL query to create the Employee table
            String createTableSQL = "CREATE TABLE Employee (" +
                                    "eid INT AUTO_INCREMENT PRIMARY KEY, " +
                                    "name VARCHAR(255) NOT NULL, " +
                                    "address VARCHAR(255) NOT NULL, " +
                                    "salary INT NOT NULL" +
                                    ")";

            // Execute the query to create the table
            stmt.executeUpdate(createTableSQL);
            System.out.println("Employee table created successfully!");

            // Check if the table has been created by listing tables
            String checkTableSQL = "SHOW TABLES LIKE 'Employee'";
            var rs = stmt.executeQuery(checkTableSQL);
            if (rs.next()) {
                System.out.println("The Employee table exists.");
            } else {
                System.out.println("The Employee table does not exist.");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            // Close resources
            try {
                if (stmt != null) stmt.close();
                if (conn != null) conn.close();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
    }
}
