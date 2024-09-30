import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class CreateStudentDatabase {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/";  // Connect to MySQL
        String user = "root";
        String password = "password";  // Use your MySQL password here

        try (Connection conn = DriverManager.getConnection(url, user, password);
             Statement stmt = conn.createStatement()) {

            String sql = "CREATE DATABASE IF NOT EXISTS Student";
            stmt.executeUpdate(sql);
            System.out.println("Database 'Student' created successfully (if not existed).");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
