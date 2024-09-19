import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class EmployeeTable {

      static void RetrieveEmployeeData(){
        try {
            // Establish a database connection
            Connection connection = DriverManager.getConnection(jdbcURL, username, password);
            Statement statement = connection.createStatement();

            // SQL query to retrieve data from Employee table
            String selectQuery = "SELECT * FROM Employee;";

            // Execute the SELECT query
            ResultSet resultSet = statement.executeQuery(selectQuery);

            // Display the results
            while (resultSet.next()) {
                int eid = resultSet.getInt("eid");
                String name = resultSet.getString("name");
                String address = resultSet.getString("address");
                int salary = resultSet.getInt("salary");

                System.out.println("EID: " + eid + ", Name: " + name + ", Address: " + address + ", Salary: " + salary);
            }

            // Close the connection
            connection.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
      }

  
    public static void main(String[] args) {
        String jdbcURL = "jdbc:mysql://localhost:3306/your_database_name";  // Replace 'your_database_name' with actual DB name
        String username = "root";  // Replace with your DB username
        String password = "";  // Replace with your DB password

        try {
            // Establish a database connection
            Connection connection = DriverManager.getConnection(jdbcURL, username, password);
            Statement statement = connection.createStatement();

            // SQL query to create the Employee table
            String createTableSQL = "CREATE TABLE IF NOT EXISTS Employee (" +
                    "eid INT AUTO_INCREMENT PRIMARY KEY, " +
                    "name VARCHAR(100) NOT NULL, " +
                    "address VARCHAR(200) NOT NULL, " +
                    "salary INT NOT NULL" +
                    ");";

            // Execute the query to create the table
            statement.execute(createTableSQL);
            System.out.println("Employee table created successfully (if it didn't already exist).");

            // Check if the table was created by listing tables
            String checkTableSQL = "SHOW TABLES LIKE 'Employee';";
            ResultSet resultSet = statement.executeQuery(checkTableSQL);

            if (resultSet.next()) {
                System.out.println("Employee table exists in the database.");
            } else {
                System.out.println("Employee table does not exist.");
            }

            // Close the connection
            connection.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
       System.out.print(" should RetrieveEmployeeData please Enter the number 1, if you are Exit the program. 2:");
      Scannner sc = new Scanner(System.in);
      int use = sc.nextInt();
      if(use == 1){
      RetrieveEmployeeData();
        
    }
}



