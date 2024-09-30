import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class CreateRegistrationTable {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/Student"; // Connect to Student database
        String user = "root";
        String password = "password"; // Use your MySQL password

        try (Connection conn = DriverManager.getConnection(url, user, password);
             Statement stmt = conn.createStatement()) {

            String sql = "CREATE TABLE IF NOT EXISTS Registration " +
                    "(id INT PRIMARY KEY, " +
                    " name VARCHAR(255), " +
                    " address VARCHAR(255), " +
                    " program VARCHAR(255))";

            stmt.executeUpdate(sql);
            System.out.println("Table 'Registration' created successfully.");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
