import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class InsertRecords {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/Student";
        String user = "root";
        String password = "password";

        try (Connection conn = DriverManager.getConnection(url, user, password)) {

            String sql = "INSERT INTO Registration (id, name, address, program) VALUES (?, ?, ?, ?)";
            PreparedStatement pstmt = conn.prepareStatement(sql);

            pstmt.setInt(1, 100);
            pstmt.setString(2, "John Doe");
            pstmt.setString(3, "123 Elm Street");
            pstmt.setString(4, "Computer Science");
            pstmt.executeUpdate();

            pstmt.setInt(1, 101);
            pstmt.setString(2, "Jane Smith");
            pstmt.setString(3, "456 Oak Avenue");
            pstmt.setString(4, "Electrical Engineering");
            pstmt.executeUpdate();

            pstmt.setInt(1, 102);
            pstmt.setString(2, "Tom Brown");
            pstmt.setString(3, "789 Pine Road");
            pstmt.setString(4, "Mechanical Engineering");
            pstmt.executeUpdate();

            pstmt.setInt(1, 103);
            pstmt.setString(2, "Alice White");
            pstmt.setString(3, "321 Birch Lane");
            pstmt.setString(4, "Civil Engineering");
            pstmt.executeUpdate();

            System.out.println("Records inserted successfully.");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
